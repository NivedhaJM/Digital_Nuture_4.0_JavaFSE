import React, { useState } from 'react';

const CurrencyConvertor = () => {
  const [rupees, setRupees] = useState('');
  const [euros, setEuros] = useState(null);

  const handleSubmit = () => {
    const euroRate = 0.011; // Example: 1 INR = 0.011 EUR
    const result = (parseFloat(rupees) * euroRate).toFixed(2);
    setEuros(result);
  };

  return (
    <div>
      <h2>Currency Convertor 💱</h2>
      <input
        type="number"
        placeholder="Enter INR"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
      />
      <button onClick={handleSubmit}>Convert</button>

      {euros && (
        <p>
          ₹{rupees} = €{euros}
        </p>
      )}
    </div>
  );
};

export default CurrencyConvertor;
