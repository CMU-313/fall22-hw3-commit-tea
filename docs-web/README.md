# Teedy Applicant Dashboard Information

In our model for Teedy as a graduate school application management system, we make each document represent a student. Below, we use the terms document and student interchangeably. To make the documents represent students, we added status and GPA as fields for each document. 

We built a dashboard page that can be used to view all of the students, their application statuses, and their GPAs.  

When a document is created, the GPA of the document can be specified here. The GPA must fall into one of eight predefined buckets.
<img width="1435" alt="image (2) copy" src="https://user-images.githubusercontent.com/111700944/194434480-9fb71b2f-9e6c-4a1a-b99e-dd1a551a659a.png">
![Screen Shot 2022-10-04 at 12 54 16 PM](https://user-images.githubusercontent.com/111700944/194434555-47576f8b-c057-4b07-b8f4-4d20c39c9952.jpg)

In addition, the status of a document can be specified here. The status has 6 categories that it can fall under.
<img width="1436" alt="image (3) copy" src="https://user-images.githubusercontent.com/111700944/194434642-14df6236-442e-45cf-a6e2-e5e47bd5225a.png">
![Screen Shot 2022-10-06 at 7 11 06 PM](https://user-images.githubusercontent.com/111700944/194434826-27f112ed-cb03-4bc6-b9f3-fb7478bd369a.jpg)

When a user clicks on the dashboard page in the navigation bar, they are taken to the dashboard page where they can see a list of all of the documents created. The documents are grouped into columns depending on the statuses of the documents (i.e. all accepted documents would go into a single column). Within each column, each document is reprented as a small box with the name and GPA of the student. Each small box also has two buttons, namely an edit button and a view button.
<img width="1436" alt="image (3)" src="https://user-images.githubusercontent.com/111700944/194434897-602ec4d9-d82d-4716-afc0-d74caf388d1d.png">
<img width="1424" alt="image (4)" src="https://user-images.githubusercontent.com/111700944/194434925-a9ddda78-1ff7-40c6-87fa-8749eb597af5.png">


The edit button will take the user back to the student/document's edit page.

<img width="1424" alt="image (4) copy 4" src="https://user-images.githubusercontent.com/111700944/194439618-986b2006-6913-4a90-ba12-b2fdf39b170c.png">


<img width="1435" alt="image (2)" src="https://user-images.githubusercontent.com/111700944/194435093-43c40ac1-e36d-41c8-854b-5237ade7b974.png">


The view button will take the user back to the student/document's display page.
<img width="1424" alt="image (4) copy 3" src="https://user-images.githubusercontent.com/111700944/194439526-37f589d4-0808-42a3-88f8-e9ad6134fe3c.png">

<img width="1436" alt="image (5)" src="https://user-images.githubusercontent.com/111700944/194435135-99a44f11-0390-4cef-aca2-b06c81f3ab1d.png">

In order to user test, one could create documents using the above process, setting their GPAs and statuses to various values. 
- One could then check the dashboard to make sure that all users were in the dashboard under the correct status columns with the correct GPAs. 
- After that, one could delete users and make sure they were removed from the dashboard as well. 
- In addition, one could click the edit buttons on a student in the dashboard and make sure that the edit button redirects to the correct student. One could then make a change to the student's GPA, and check that the GPA change was reflected in the dashboard. 
- One could also click the view button on a student in the dashboard, and make sure that the link went to the correct student. If the link went to the correct student, one could change the status and then check the dashboard to make sure that the student moved to the correct dashboard column for their new status.
