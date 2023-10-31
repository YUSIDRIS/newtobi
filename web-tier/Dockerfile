FROM node
WORKDIR /react-app/
COPY web-tier/package.json /react-app/
RUN npm cache clean --force
RUN npm install
COPY .  .
CMD [ "npm", "start"]