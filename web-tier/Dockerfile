FROM node
WORKDIR /react-app/
COPY web-tier/package.json /react-app/
RUN yarn 
COPY .  .
CMD [ "npm", "start"]