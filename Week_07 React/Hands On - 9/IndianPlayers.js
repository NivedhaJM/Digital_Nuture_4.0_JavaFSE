import React from 'react';

const IndianPlayers = () => {
  const oddTeam = ["Rahul", "Kohli", "Gill", "Pant", "Jadeja"];
  const evenTeam = ["Rohit", "Hardik", "Ashwin", "Bumrah", "Shami"];

  const [odd1, odd2, odd3, odd4, odd5] = oddTeam;
  const [even1, even2, even3, even4, even5] = evenTeam;

  const T20players = ["Surya", "Ishan", "Arshdeep"];
  const RanjiTrophy = ["Shaw", "Jurel", "Sundar"];
  const mergedPlayers = [...T20players, ...RanjiTrophy];

  return (
    <div>
      <h2>Odd Team Players</h2>
      {[odd1, odd2, odd3, odd4, odd5].map((player, index) => (
        <p key={index} style={{ margin: "4px " }}>{player}</p>

      ))}

      <h2>Even Team Players</h2>
      {[even1, even2, even3, even4, even5].map((player, index) => (
        <p key={index} style={{ margin: "4px 0" }}>{player}</p>

      ))}

      <h2>Merged Players (T20 + Ranji Trophy)</h2>
      {mergedPlayers.map((player, index) => (
        <p key={index} style={{ margin: "4px 0" }}>{player}</p>

      ))}
    </div>
  );
};

export default IndianPlayers;
