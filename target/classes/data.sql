INSERT INTO patient (patient_id, patient_name, age, gender, contact_number, address)
VALUES (1001, 'Uhsin Tindi ', 23, 'Female', '3634567890', 'Helm St 562');
INSERT INTO patient (patient_id, patient_name, age, gender, contact_number, address)
VALUES(1002, 'Abdullah Bhai', 25, 'Male', '9876543210', 'Long Island 90');
INSERT INTO patient (patient_id, patient_name, age, gender, contact_number, address)
VALUES (1003, 'Rarba Jackson Dabra', 45, 'Male', '5555555555', 'Rover St Long Bay');
INSERT INTO patient (patient_id, patient_name, age, gender, contact_number, address)
VALUES (1004, 'Lily Meyers', 32, 'Female', '34641111101', 'Manhattan St 24');
INSERT INTO patient (patient_id, patient_name, age, gender, contact_number, address)
VALUES (1005, 'Garett Graham', 28, 'Male', '3569999999', 'York Bouelevard 7');
INSERT INTO patient (patient_id, patient_name, age, gender, contact_number, address)
VALUES (1006, 'Kiara Falcone', 35, 'Female', '3698888888', 'Haven Island Road 56');
INSERT INTO patient (patient_id, patient_name, age, gender, contact_number, address)
VALUES (1007, 'Keviv Vasuli', 42, 'Male', '9124444444', 'Bristol House 45');
INSERT INTO patient (patient_id, patient_name, age, gender, contact_number, address)
VALUES (1008, 'Jude Duarte', 31, 'Female', '3678222222', 'Malcolm Avenue 4');
INSERT INTO patient (patient_id, patient_name, age, gender, contact_number, address)
VALUES(1009, 'Cole Nash', 29, 'Male', '7766777733', 'Leonardo Apartments 7');
INSERT INTO patient (patient_id, patient_name, age, gender, contact_number, address)
VALUES (1010, 'Arielle King', 27, 'Female', '6666656342',  'Main Hills Lane 90');



-- Doctor Table Entries
INSERT INTO doctor (doctor_id, doctor_name, email, department)
VALUES (1001, 'Dr. Romeo Hunington', 'romeohun@gmail.com', 'Cardiology');
INSERT INTO doctor (doctor_id, doctor_name, email, department)
VALUES (1002, 'Dr. James Bond', 'jamesbond@hotmail.com', 'Pediatrics');
INSERT INTO doctor (doctor_id, doctor_name, email, department)
VALUES  (1003, 'Dr. Bon Jovi', 'bonjovi@gmail.com', 'Orthopedics');
INSERT INTO doctor (doctor_id, doctor_name, email, department)
VALUES (1004, 'Dr. Rhea Guttikar', 'rhea129@gmail.com', 'Dermatology');
INSERT INTO doctor (doctor_id, doctor_name, email, department)
VALUES (1005, 'Dr. Aynaas Ina', 'aynass34@hotmail.com', 'Ophthalmology');
INSERT INTO doctor (doctor_id, doctor_name, email, department)
VALUES (1006, 'Dr. Emily Davis', 'emilydavis@hotmail.com', 'Gastroenterology');
INSERT INTO doctor (doctor_id, doctor_name, email, department)
VALUES (1007, 'Dr. Eric Wilson', 'ericwilson@gmail.com', 'Neurology');
INSERT INTO doctor (doctor_id, doctor_name, email, department)
VALUES (1008, 'Dr. Robert Downey', 'robdown@gmail.com', 'Obstetrics and Gynecology');
INSERT INTO doctor (doctor_id, doctor_name, email, department)
VALUES (1009, 'Dr. Vivin Anderson', 'vivinanderson@gmail.com', 'ENT');
INSERT INTO doctor (doctor_id, doctor_name, email, department)
VALUES (1010, 'Dr. Saanj Seetha', 'saanjseets@gmail.com', 'Psychiatry');


-- Appointment Table Entries
INSERT INTO appointment (appointment_id, appointment_date, description)
VALUES (1001, '2023-06-07', 'General check-up');
INSERT INTO appointment (appointment_id, appointment_date, description)
VALUES (1002, '2023-06-08', 'Dental cleaning');
INSERT INTO appointment (appointment_id, appointment_date, description)
VALUES (1003, '2023-06-09', 'Physical therapy session');
INSERT INTO appointment (appointment_id, appointment_date, description)
VALUES (1004, '2023-06-10', 'Eye examination');
INSERT INTO appointment (appointment_id, appointment_date, description)
VALUES (1005, '2023-06-11', 'Annual physical check-up');


-- Medical Record Table Entries
INSERT INTO medical_record (medical_id, blood_type, medical_history)
VALUES (1001, 'A+', 'No significant medical history');
INSERT INTO medical_record (medical_id, blood_type, medical_history)
VALUES (1002, 'O-', 'Allergic to penicillin');
INSERT INTO medical_record (medical_id, blood_type, medical_history)
VALUES (1003, 'B+', 'Previous surgery for appendicitis');
INSERT INTO medical_record (medical_id, blood_type, medical_history)
VALUES (1004, 'AB+', 'Family history of diabetes');
INSERT INTO medical_record (medical_id, blood_type, medical_history)
VALUES (1005, 'A-', 'Hypertension under control');


-- Prescription Table Entries
INSERT INTO prescription (prescription_id, medication, dosage, instructions)
VALUES (1001, 'Amoxicillin', '500mg', 'Take twice daily with meals');
INSERT INTO prescription (prescription_id, medication, dosage, instructions)
VALUES (1002, 'Ibuprofen', '200mg', 'Take as needed for pain relief');
INSERT INTO prescription (prescription_id, medication, dosage, instructions)
VALUES (1003, 'Lisinopril', '10mg', 'Take once daily in the morning');
INSERT INTO prescription (prescription_id, medication, dosage, instructions)
VALUES (1004, 'Simvastatin', '20mg', 'Take at bedtime');
INSERT INTO prescription (prescription_id, medication, dosage, instructions)
VALUES (1005, 'Levothyroxine', '100mcg', 'Take on an empty stomach');

