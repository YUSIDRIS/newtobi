FROM node
WORKDIR /usr/src/new
COPY app-tier/package.json .
RUN  yarn install
COPY . .
EXPOSE 4000
CMD [ "node", "index.js"]