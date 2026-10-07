package ru.ok.android.externcalls.sdk.api.request;

import android.net.Uri;
import defpackage.ore;
import defpackage.sp;
import defpackage.st0;
import defpackage.tp;
import defpackage.tt0;
import defpackage.xtj;
import defpackage.yw3;
import defpackage.zo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a?\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0000\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0001\u0010\u0006*\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "Lzo;", "Ltt0;", "toBatchRequest", "(Ljava/util/List;)Lzo;", "R", "T", "requests", "parseBatchResponse", "(Ltt0;Ljava/util/List;)Ljava/util/List;", "calls-sdk"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class BatchRequestKt {
    public static final <R extends zo, T> List<T> parseBatchResponse(tt0 tt0Var, List<? extends R> list) {
        Object obj;
        xtj xtjVar;
        List<? extends R> list2 = list;
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            zo zoVar = (zo) it.next();
            xtj[] xtjVarArr = tt0Var.a;
            int length = xtjVarArr.length;
            int i = 0;
            while (true) {
                obj = null;
                if (i >= length) {
                    ore.f("Array contains no element matching the predicate.");
                    return null;
                }
                xtjVar = xtjVarArr[i];
                if (((zo) xtjVar.c) == zoVar) {
                    break;
                }
                i++;
            }
            Object obj2 = xtjVar.b;
            if (!(obj2 instanceof tp)) {
                obj = obj2;
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static final zo toBatchRequest(List<? extends zo> list) {
        Uri uri = st0.c;
        ArrayList arrayList = new ArrayList();
        for (zo zoVar : list) {
            arrayList.add(new sp(zoVar, zoVar));
        }
        return new st0((sp[]) arrayList.toArray(new sp[0]));
    }
}
