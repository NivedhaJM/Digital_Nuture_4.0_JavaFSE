import React from 'react';

const FlightList = () => {
  const flights = [
    { id: 1, airline: "IndiGo", from: "Chennai", to: "Delhi", price: 4200 },
    { id: 2, airline: "Air India", from: "Mumbai", to: "Kolkata", price: 5500 },
    { id: 3, airline: "Vistara", from: "Bangalore", to: "Hyderabad", price: 3100 },
  ];

  return (
    <div>
      <h2>Available Flights</h2>
      <ul>
        {flights.map(flight => (
          <li key={flight.id}>
            {flight.airline}: {flight.from} → {flight.to} | ₹{flight.price}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default FlightList;
