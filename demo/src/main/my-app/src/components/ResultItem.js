import React from 'react'
import './ResultItem.css';

function ResultItem({item}) {
    console.log(item)
    var i=0;
  return (
    <div>
        <div className="personalInfo">
            <div>{item.name}</div>
            <div>{item.associateId}</div>
            <div>{item.email}</div>
            <div>{item.mobNum}</div>
        </div>
        <div className="technicalSkills">
            <div>{item.html}</div>
            <div>{item.angular}</div>
        </div>
    </div>
  )
}

export default ResultItem