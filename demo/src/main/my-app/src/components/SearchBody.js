import './SearchBody.css';
import {useState} from 'react';
import axios from 'axios';

function SearchBody({setResults}){
    const [firstName,setFirstName]=useState('');
    const [id,setId]=useState();
    const [skillName,setSkillName]=useState('');

    const changeName=(e)=>{
        setFirstName(e.target.value);
        console.log(firstName);
    }

    const changeId=(e)=>{
        setId(e.target.value);
        console.log(id);
    }

    const changeSkill=(e)=>{
        setSkillName(e.target.value);
        console.log(skillName);
    }

    const clickSubmit=(e)=>{
        e.preventDefault();
        console.log("clicked")
        if(id!==''){
        axios.get('http://192.168.1.5:8080/skill-tracker/api/v1/admin/associateId/'+id)
        .then(response =>{
            console.log(response);
            setResults(response.data);
        });
    }else if(skillName!==''){
        axios.get('http://192.168.1.5:8080/skill-tracker/api/v1/admin/name/'+skillName)
        .then(response =>{
            console.log(response);
            setResults(response.data);
        });
    }
    }
    
    return(
        <form>
            <div>
                <label name='nameLabel'>First Name:</label>
                <input type='text' name='name' onChange={changeName}></input>
            </div>
            <div>
                <label name='idLabel' >Associate ID:</label>
                <input type='text' name='id' onChange={changeId}></input>
            </div>
            <div>
                <label name='skillNameLabel' >Skill Name:</label>
                <input type='text' name='skillName' onChange={changeSkill}></input>
            </div>
            <div>
                <button type='submit' onClick={clickSubmit}>Search</button>
            </div>
        </form>
    )
}

export default SearchBody;