import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { environment } from "src/environments/environment";

@Injectable({
    providedIn: "root"
})
export class ConsultaService{
    constructor(private http : HttpClient){}

    getValueFromAlticci$ = (n : string) : Observable<any> => {
        return this.http.get(environment.pathRequest.consultaSequence.replace("{n}", n));
    }
}