package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class rli extends mdh implements cf7 {
    public List e;
    public List f;
    public List g;
    public int h;
    public final /* synthetic */ uli i;
    public final /* synthetic */ List j;
    public final /* synthetic */ List k;
    public final /* synthetic */ List l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rli(uli uliVar, List list, List list2, List list3, lq4 lq4Var) {
        super(1, lq4Var);
        this.i = uliVar;
        this.j = list;
        this.k = list2;
        this.l = list3;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new rli(this.i, this.j, this.k, this.l, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((rli) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        List listAsList;
        List listAsList2;
        List listAsList3;
        int i = this.h;
        try {
            if (i == 0) {
                ch3.d0(obj);
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#update3aRegions");
                }
                uli uliVar = this.i;
                List list = this.j;
                List list2 = this.k;
                List list3 = this.l;
                ze2 ze2VarA = uliVar.c.a();
                this.e = list;
                this.f = list2;
                this.g = list3;
                this.h = 1;
                obj = ze2VarA.g(this);
                hu4 hu4Var = hu4.a;
                if (obj == hu4Var) {
                    return hu4Var;
                }
                listAsList = list;
                listAsList2 = list2;
                listAsList3 = list3;
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                listAsList3 = this.g;
                listAsList2 = this.f;
                listAsList = this.e;
                ch3.d0(obj);
            }
            AutoCloseable autoCloseable = (AutoCloseable) obj;
            try {
                cf2 cf2Var = (cf2) autoCloseable;
                if (listAsList == null) {
                    listAsList = Arrays.asList(te2.a);
                }
                List list4 = listAsList;
                if (listAsList2 == null) {
                    listAsList2 = Arrays.asList(te2.a);
                }
                List list5 = listAsList2;
                if (listAsList3 == null) {
                    listAsList3 = Arrays.asList(te2.a);
                }
                xf5 xf5VarB = ie2.b(cf2Var, null, null, null, list4, list5, listAsList3, 7);
                p90.f(autoCloseable, null);
                return xf5VarB;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p90.f(autoCloseable, th);
                    throw th2;
                }
            }
        } catch (CancellationException e) {
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e);
            }
            return uli.l;
        }
    }
}
