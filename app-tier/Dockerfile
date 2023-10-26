FROM node:latest
WORKDIR /usr/src/new
COPY app-tier/package.json .
RUN npm install
COPY . .
EXPOSE 4000
CMD [ "node", "index.js"]
#idris dockerSSSd doo it