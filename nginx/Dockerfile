FROM nginx:alpine

RUN apk add --no-cache bash

COPY ./default.template.conf /etc/nginx/templates/default.template.conf
COPY ./entrypoint.sh /entrypoint.sh

RUN chmod +x /entrypoint.sh

ENTRYPOINT ["/entrypoint.sh"]
CMD ["nginx", "-g", "daemon off;"]

