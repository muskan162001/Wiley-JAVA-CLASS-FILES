console.log("Starting")

function userLogin (username, pw){
    return new Promise((resolve, reject) => { 
        setTimeout(() => {
            console.log("user logged in");
            resolve( {uname: username} )
        }, 5000);   
    });
}
function getPreojectByUser(uname){
    return new Promise((resolve, reject) => {
        setTimeout(() => { 
            console.log("Project are here"); 
            resolve(["proj1", "proj2", "proj3"])
    }, 5000);
});
}

userLogin("bvsrao", "7797979")
    .then( user => getPojectsByUser(user))
    .then( projects => projDetails (projects[0]))
    .then(details => console.log(details))
    .catch(err => console.log(err))
    .finally (() => console.log("final message"))


async function displayUserProjectDetails(){
    try {
        let userName = await userLogin("bvsrao", "pw");
        let projects = await getPojectsByUser (userName);
        let proDetails = await projDetails (projects[0]);
        console.log(proDetails) }
        catch (error) {
            console.log(error.message)
        }
    }
        displayUserProjectDetails()