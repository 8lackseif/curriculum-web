FROM node:latest as build

WORKDIR /app

COPY package*.json ./

RUN npm install

RUN npm install -g @angular/cli

COPY . .

RUN ng build --configuration=production

EXPOSE 4000

CMD ["node", "dist/frontend/server/server.mjs"]
