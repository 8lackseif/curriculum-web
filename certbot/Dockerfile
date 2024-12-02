FROM certbot/certbot:latest

ARG DOMAIN
ARG EMAIL

ENV DOMAIN=${DOMAIN}
ENV EMAIL=${EMAIL}

CMD ["sh", "-c", "certbot certonly --webroot --webroot-path=/var/www/certbot -d $DOMAIN -d www.$DOMAIN --non-interactive --agree-tos --email $EMAIL && while :; do sleep 12h; certbot renew; done"]

