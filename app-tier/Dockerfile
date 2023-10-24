FROM node:latest
WORKDIR /usr/src/new
COPY package.json .
RUN npm install
COPY . .
EXPOSE 4000
CMD [ "node", "index.js"]
#idris dockerSSS