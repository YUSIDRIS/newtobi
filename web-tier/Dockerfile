FROM node:latest
WORKDIR /react-app/
COPY web-tier/package.json .
RUN npm cache clean --force
RUN npm ci
COPY .  .
CMD [ "npm", "start"]