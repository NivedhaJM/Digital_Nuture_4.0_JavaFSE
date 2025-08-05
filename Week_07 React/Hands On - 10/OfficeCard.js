import React from 'react';

const OfficeCard = ({ office }) => {
  const rentStyle = {
    color: office.rent > 60000 ? 'green' : office.rent < 60000 ? 'red' : 'black',
    fontWeight: 'bold'
  };

  return (
    <div className="office-card">
      <img src={office.image} alt={office.name} />
      <h2>{office.name}</h2>
      <p><strong>Address:</strong> {office.address}</p>
      <p style={rentStyle}><strong>Rent:</strong> ₹{office.rent}</p>
    </div>
  );
};

export default OfficeCard;
