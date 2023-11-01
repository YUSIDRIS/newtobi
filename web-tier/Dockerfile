FROM node
WORKDIR /react-app/
COPY web-tier/package.json /react-app/
RUN npm i -g svgo
RUN yarn 
COPY .  .
CMD [ "npm", "start"]