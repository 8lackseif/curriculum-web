#!/bin/bash

# Reemplazar marcadores de posición en la plantilla
envsubst '${DOMAIN}' < /etc/nginx/templates/default.template.conf > /etc/nginx/conf.d/default.conf

# Ejecutar Nginx
exec "$@"

