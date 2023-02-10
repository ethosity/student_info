---------------Subject---------------
INSERT INTO SUBJECT(SUBJECT_ID, SUBJECT_NAME) values
('M1','MATH'),
('E1','ENGLISH'),
('P1','PHYSICS'),
('C1','CHEMISTRY'),
('S1','SCIENCE'),
('H1','HISTORY'),
('C2','CIVICS'),
('M1S1','MATH, SCIENCE');

-------------Class----------------
INSERT INTO CLASS(CLASS_ID, CLASS_NAME) values
('C1', '1ST'),
('C2', '2ST'),
('C3', '3RD'),
('C4', '4TH'),
('C5', '5TH'),
('C6', '6TH');

-------------LOCATION----------------
INSERT INTO LOCATION(LOCATION_ID, LOCATION_NAME) values
('BIHDHA1','DHANESHWAR GHAT'),
('BIHPUL1','PULAPR'),
('BIHBHA1','BHARAOPAR'),
('PATASH1','ASHOK RAJPATH'),
('GAYTEK1','TEKARI');

-------------CITY----------------
INSERT INTO CITY(CITY_ID, CITY_NAME) values
('BIH1', 'BIHAR SHARIF'),
('BIH2', 'BIHAR SHARIF'),
('PAT', 'PATNA'),
('GAY', 'GAYA');

-------------RATING----------------
INSERT INTO RATING(TEACHER_ID, RATING_VALUE) values
(100, '*'),
(200, '**'),
(300, '***'),
(400, '****'),
(500, '*****');

-------------IMAGE----------------
INSERT INTO IMAGE(TEACHER_ID, TEACHER_IMAGE) values
(100, 'abc'),
(200, 'kbc'),
(300, 'tpb'),
(400, 'wqert'),
(500, 'tfredt');

-------------GLOBAL_TEACHER----------------
INSERT INTO GLOBAL_TEACHER(
TEACHER_ID,
TEACHER_NAME,
SUBJECT_ID_LEVEL_1,
CLASS_ID_LEVEL_1,
LOCATION_ID_LEVEL_1,
CITY_ID_LEVEL_3) values
(100, 'AAAA', 'C1', 'C1', 'BIHBHA1', 'BIH1');

