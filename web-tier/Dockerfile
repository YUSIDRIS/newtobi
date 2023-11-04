FROM node
WORKDIR /react-app/
COPY web-tier/package.json /react-app/
RUN npm install --save-dev @babel/plugin-proposal-private-property-in-object --legacy-peer-deps
RUN yarn 
COPY .  .
CMD [ "npm", "start"]