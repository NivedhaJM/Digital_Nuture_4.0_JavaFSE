import React from 'react';
import './App.css';
import OfficeCard from './OfficeCard';

function App() {
  const officeList = [
    {
      name: "Skyline Towers",
      rent: 55000,
      address: "123, MG Road, Bengaluru",
      image: "https://www.olr.com/Pictures/Building_Interior_Photo/7981_608686_int_photo1.jpg"
    },
    {
      name: "Tech Park One",
      rent: 75000,
      address: "88, OMR, Chennai",
      image: "https://www.panchshil.com/assets/images/commercials/T3hq4uqkqtDTxyhwKKxoenylMOydUE.webp"
    },
    {
      name: "WorkHub Space",
      rent: 60000,
      address: "45, Hinjewadi, Pune",
      image: "https://res.cloudinary.com/myhq/image/upload/workspaces/workhub-baner-business-bay/xfspnv.jpg"
    }
  ];

  return (
    <div className="App">
      <h1>🏢 Office Space Rental App</h1>
      <div className="office-list">
  {officeList.map((office, index) => (
    <OfficeCard key={index} office={office} />
  ))}
</div>
    </div>
  );
}

export default App;

