import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConverter';

function App() {
  const [count, setCount] = useState(0);

  // Multiple methods on Increase
  const handleIncrement = () => {
    incrementCount();
    sayHello();
  };

  const incrementCount = () => {
    setCount(prev => prev + 1);
  };

  const decrementCount = () => {
    setCount(prev => prev - 1);
  };

  const sayHello = () => {
    console.log("Hello! Counter was incremented.");
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const onPress = (e) => {
    alert("I was clicked");
  };

  return (
    <div className="App">
      <h1>🧪 Event Examples App</h1>
      <h2>Counter: {count}</h2>

      <button onClick={handleIncrement}>Increment</button>
      <button onClick={decrementCount}>Decrement</button>

      <br /><br />
      <button onClick={() => sayWelcome("Welcome!")}>Say Welcome</button>

      <br /><br />
      <button onClick={onPress}>Click Me</button>

      <br /><br />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
