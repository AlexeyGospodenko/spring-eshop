INSERT INTO USERS (ID, NAME, PASSWORD, EMAIL, PHONE, ARCHIVE, ROLE/*, BUCKET_ID*/)
VALUES (1, 'admin', '$2a$10$yBSV0DM5YKNT7.Bjj4nXk.rJ6Oti.C2T7ombrOd.6g1yk5aD.4jv.', 'adminMail@mail.ru', '111111', false, 'ADMIN'/*, null*/),
       (2, 'user', '$2a$10$yBSV0DM5YKNT7.Bjj4nXk.rJ6Oti.C2T7ombrOd.6g1yk5aD.4jv.', 'userMail@mail.ru', '222222', false, 'CLIENT'/*, null*/);

ALTER SEQUENCE USER_SEQ RESTART WITH 3;
