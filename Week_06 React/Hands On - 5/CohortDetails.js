import React from 'react';
import styles from './CohortDetails.module.css';

const CohortDetails = ({ cohort }) => {
  const { id, technology, startedOn, status, coach, trainer } = cohort;

  const headingStyle = {
    color: status.toLowerCase() === 'ongoing' ? 'green' : 'blue'
  };

  return (
    <div className={styles.box}>
      <h3 style={headingStyle}>
        {id} - {technology}
      </h3>
      <dl>
        <dt>Started On</dt>
        <dd>{startedOn}</dd>

        <dt>Current Status</dt>
        <dd>{status}</dd>

        <dt>Coach</dt>
        <dd>{coach}</dd>

        <dt>Trainer</dt>
        <dd>{trainer}</dd>
      </dl>
    </div>
  );
};

export default CohortDetails;
