import React from 'react';


const ListofPlayers = () => {
  const players = [
    { name: "Virat Kohli", score: 88 },
    { name: "Rohit Sharma", score: 95 },
    { name: "Shubman Gill", score: 65 },
    { name: "KL Rahul", score: 72 },
    { name: "Rishabh Pant", score: 68 },
    { name: "Hardik Pandya", score: 74 },
    { name: "Jadeja", score: 62 },
    { name: "Ashwin", score: 81 },
    { name: "Bumrah", score: 70 },
    { name: "Shami", score: 66 },
    { name: "Kuldeep", score: 50 }
  ];

  const filteredPlayers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      {players.map((player, index) => (
        <p key={index} style={{ margin: "4px 0" }}>
  {player.name} - {player.score}
</p>
      ))}

      <h2>Players with score below 70</h2>
      {filteredPlayers.map((player, index) => (
        <p key={index} style={{ margin: "4px 0" }}>
  {player.name} - {player.score}
</p>
      ))}
    </div>
  );
};

export default ListofPlayers;
