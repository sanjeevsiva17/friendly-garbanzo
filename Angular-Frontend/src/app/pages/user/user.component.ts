import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
    selector: 'user-cmp',
    moduleId: module.id,
    templateUrl: 'user.component.html'
})

export class UserComponent implements OnInit{
    public name;
    public b_name;
    public gst;



    constructor(private http: HttpClient)
    {
      
    }

    ngOnInit()
    {
        this.load()
    }

    public load()
    {
      console.log("Hi")
      this.http.get('http://192.168.100.134:8112/api/profile/GSTIN1234567890').subscribe(json => {
        console.log(json)
        this.name=json.full_name;
        this.b_name=json.business_name
        this.gst=json.gstno
      console.log(typeof(json))
      
    }
      );
    }
}
