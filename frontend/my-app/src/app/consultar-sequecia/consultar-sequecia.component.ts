import { Component, OnInit } from '@angular/core';
import { ConsultaService } from '../service/consulta.service';

@Component({
  selector: 'app-consultar-sequecia',
  templateUrl: './consultar-sequecia.component.html',
  styleUrls: ['./consultar-sequecia.component.css']
})
export class ConsultarSequeciaComponent implements OnInit {

  indexContent : string = "";
  valueContent : number = 0;

  constructor( private service : ConsultaService) { }

  ngOnInit(): void {
  }

   getValueFromAlticci(){
    console.log(this.indexContent);
    return this.service.getValueFromAlticci$(this.indexContent).subscribe(
      res => {
        this.valueContent = res;
        console.log(res)
      }
    );
   }

}
