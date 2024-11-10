print('START');

db = db.getSiblingsDB('event-service');

db.createUser(
    {
        user: 'admin',
        pwd: 'password',
        roles: [{ role: 'readWrite', db: 'event-service' }]
    }
);

db.createCollection('event');

print('END')