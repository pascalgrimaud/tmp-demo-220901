import { Injectable } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { Resolve, ActivatedRouteSnapshot, Router } from '@angular/router';
import { Observable, of, EMPTY } from 'rxjs';
import { mergeMap } from 'rxjs/operators';

import { IComment } from '../comment.model';
import { CommentService } from '../service/comment.service';

@Injectable({ providedIn: 'root' })
export class CommentRoutingResolveService implements Resolve<IComment | null> {
  constructor(protected service: CommentService, protected router: Router) {}

  resolve(route: ActivatedRouteSnapshot): Observable<IComment | null | never> {
    const id = route.params['id'];
    if (id) {
      return this.service.find(id).pipe(
        mergeMap((comment: HttpResponse<IComment>) => {
          if (comment.body) {
            return of(comment.body);
          } else {
            this.router.navigate(['404']);
            return EMPTY;
          }
        })
      );
    }
    return of(null);
  }
}
