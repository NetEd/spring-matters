CREATE TABLE IF NOT EXISTS CDR_DATA(
	PH_NUM INT,
	DATA varchar(255));

INSERT INTO CDR_DATA (PH_NUM, DATA) 
VALUES(2062223333, 'Placeholder for cdr report data');
VALUES(2063333444, 'Placeholder for cdr report data2');

CREATE TABLE IF NOT EXISTS MIDDLEWARE_JOB (
REPORT_TYPE VARCHAR(255),
REPORT_FROM_DATE VARCHAR(255),
REPORT_TO_DATE VARCHAR(255),
RMS_REQUEST_ID INT,
JOB_ID INT,
PRIORITY VARCHAR(255),
STATUS VARCHAR(255),
STATUS_DESCRIPTION VARCHAR(255),
JOB_DATA LONGVARCHAR,
CREATED_DATE DATE,
UPDATED_DATE DATE
);


/*
INSERT INTO MIDDLEWARE_JOB (REPORT_TYPE, REPORT_FROM_DATE, REPORT_TO_DATE,RMS_REQUEST_ID, JOB_ID, PRIORITY, STATUS, STATUS_DESCRIPTION, JOB_DATA, CREATED_DATE, UPDATED_DATE)
VALUES('SUBSCRIBER', '10/10/2015', '10/10/2016',4321, 2233, 'Medium', 'OPEN', '', 
'{"version": "0.1","version_date": "2005-12-02","RMS_Request_Id": 4321,
"Unique_Job_Id": 2233,"Call_Back_URL": "http://rms.att.com.gov/job_id/4321","Request_Type": "LI_Provisioning",
"Request_Submitted_By": "Kerad.2","Request_Comments": "here are my request comments",
"Priority": "Normal","SLA": "8 Hours","Subscription_Identifiers": [{"type": "Mobile_Phone","value": "232323232",
 "from_date": "2016-10-11:12:22:33.456Z",
 "to_date": "2016-10-12:11:11:22:345Z"}],
"Requested_Records_Types": ["Web_Activity","Voice","SMS"],
"Requested_Record_dates": {"from_date": "2000-01-01:00:11:22.333Z","to_date": "2000-01-01:22:33:44.555Z"},
"Delivery_Info": {"Delivery_Method": "SCP","Server": "12:34:56:78","Port": 1234,"Authentication_Mode": "VPN_CERT","Location": "cygwindr/files/phone_records"}}',
NOW(), NOW());
*/



 INSERT INTO MIDDLEWARE_JOB (REPORT_TYPE, REPORT_FROM_DATE, REPORT_TO_DATE,RMS_REQUEST_ID, JOB_ID, PRIORITY, STATUS, STATUS_DESCRIPTION, JOB_DATA, CREATED_DATE, UPDATED_DATE) 
 VALUES('CDR', '10/10/2015', '10/10/2016', 1234, 5678, 'High', 'OPEN', '', 
 '{"version": "0.1","version_date": "2015-12-02","RMS_Request_Id": 1234,
 "Unique_Job_Id": 5678,"Call_Back_URL": "http://rms.att.com.gov/job_id/1234","Request_Type": "Records_Production",
 "Request_Submitted_By": "Kerad.2","Request_Comments": "some comments here about this request",
 "Priority": "None","SLA": "88 Hours","Subscription_Identifiers": [{"type": "IP_Address","value": "98.12.76.45",
 "from_date": "2016-09-01:12:22:33.456Z",
 "to_date": "2016-09-02:11:11:22:345Z"},
  {"type": "IP_Address","value": "12.34.56.78","from_date": "2013-12-25:12:34:56.789Z","to_date": "2014-01-01:00:00:00.123Z"}],
 "Requested_Records_Types": ["Subscriber_Records","SSN/DL/DOB_Records",
 "Features_Records","Device_Profile_Records","Payment_Info_Record","Tower_Search_Record","Location_Records"],
 "Requested_Record_dates": {"from_date": "2000-01-01:00:11:22.333Z","to_date": "2000-01-01:22:33:44.555Z"},
 "Delivery_Info": {"Delivery_Method": "Return To RMS"}}',
  NOW(), NOW());
  





