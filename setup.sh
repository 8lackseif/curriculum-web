#!/bin/bash

if [ "$(id -u)" -ne 0 ]; then
  echo "Permission Denied" >&2
  exit 1
fi

source .env

if [[ -z "$DOMAIN" || -z "$EMAIL" ]]; then
  echo "DOMAIN and EMAIL environment variables not found"
  exit 1
fi

sudo apt update
sudo apt upgrade

sudo apt install nginx
sudo systemctl start nginx
sudo systemctl enable nginx

sudo apt install certbot python3-certbot-nginx

sudo certbot --nginx --agree-tos --no-eff-email --email ${EMAIL} -d ${DOMAIN} --non-interactive


sudo envsubst < "nginx.conf" > "/etc/nginx/sites-available/default.conf"

sudo ln -s "/etc/nginx/sites-available/default.conf" "/etc/nginx/sites-enabled/default"

sudo nginx -t

sudo systemctl restart nginx