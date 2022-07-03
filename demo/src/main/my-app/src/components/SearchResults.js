import React from 'react'
import ResultItem from './ResultItem'

function SearchResults({results}) {
    console.log(results)
  return (
    <div>
        <div className="titleResults">Results</div>
        {results.map(item=>(
            <ResultItem item={item}/>
        ))}
    </div>
  )
}

export default SearchResults