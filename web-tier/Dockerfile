FROM node:latest
WORKDIR /react-app/
COPY web-tier/package.json /react-app/
RUN npm install
COPY .  .
CMD [ "npm", "start"]