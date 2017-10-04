import { NgModule } from '@angular/core';
import {RouterModule,Routes} from '@angular/router';
import {IndexComponent} from "./index/index.component";
import {NoteComponent} from "./note/note.component";
import {BrowseComponent} from "./browse/browse.component";
import {MatchComponent} from "./match/match.component";

const routes: Routes = [
  {path: '', redirectTo: 'note', pathMatch: 'full'},
  {path: 'index', component: IndexComponent},
  {path: 'browse', component: BrowseComponent},
  {path: 'note', component: NoteComponent},
  {path: 'match', component: MatchComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
