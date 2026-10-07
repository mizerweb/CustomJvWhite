package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.LinkedList;
import one.me.location.map.pick.PickLocationScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class d4c extends FrameLayout {
    public final d0c a;
    public final int b;
    public urh c;
    public urh d;
    public wq7 e;
    public urh f;
    public po7 g;
    public String h;
    public c4c i;

    public d4c(Context context) {
        int iOrdinal;
        super(context);
        this.a = new d0c(this, context);
        int i = 1;
        setClickable(true);
        nh5 nh5VarM = xvc.m(nh5.b);
        if (nh5VarM != null && (iOrdinal = nh5VarM.ordinal()) != 0 && iOrdinal != 1) {
            int i2 = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i2 = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            ore.o();
                            throw null;
                        }
                        i = i2;
                    }
                } else {
                    i = i2;
                }
            }
        }
        this.b = i;
    }

    public final void a(final cf7 cf7Var, final PickLocationScreen pickLocationScreen, final String str) {
        this.h = str;
        vtb vtbVar = new vtb() { // from class: b4c
            @Override // defpackage.vtb
            public final void O(po7 po7Var) {
                y8l y8lVar = po7Var.a;
                d4c d4cVar = this.a;
                d4cVar.g = po7Var;
                rai raiVarD = po7Var.d();
                raiVarD.getClass();
                try {
                    guk gukVar = (guk) raiVarD.a;
                    Parcel parcelL0 = gukVar.l0();
                    int i = duk.a;
                    parcelL0.writeInt(0);
                    gukVar.m0(6, parcelL0);
                    try {
                        Parcel parcelL1 = y8lVar.l0();
                        parcelL1.writeInt(0);
                        y8lVar.m0(41, parcelL1);
                        try {
                            Parcel parcelL2 = y8lVar.l0();
                            parcelL2.writeInt(0);
                            Parcel parcelK0 = y8lVar.k0(20, parcelL2);
                            parcelK0.readInt();
                            parcelK0.recycle();
                            try {
                                Parcel parcelL3 = y8lVar.l0();
                                parcelL3.writeInt(0);
                                y8lVar.m0(18, parcelL3);
                                rai raiVarD2 = po7Var.d();
                                raiVarD2.getClass();
                                try {
                                    guk gukVar2 = (guk) raiVarD2.a;
                                    Parcel parcelL4 = gukVar2.l0();
                                    parcelL4.writeInt(0);
                                    gukVar2.m0(1, parcelL4);
                                    try {
                                        Parcel parcelL5 = y8lVar.l0();
                                        parcelL5.writeFloat(19.0f);
                                        y8lVar.m0(93, parcelL5);
                                        String str2 = str;
                                        if (str2 == null || str2.length() == 0) {
                                            po7Var.f(1);
                                        } else {
                                            po7Var.f(0);
                                            d4cVar.f(pq3.j.e(d4cVar.getContext()).m());
                                        }
                                        po7Var.i(d4cVar);
                                        po7Var.g(new oo(d4cVar, pickLocationScreen, po7Var, 18));
                                        cf7Var.invoke(po7Var);
                                    } catch (RemoteException e) {
                                        f4a.d(e);
                                    }
                                } catch (RemoteException e2) {
                                    f4a.d(e2);
                                }
                            } catch (RemoteException e3) {
                                f4a.d(e3);
                            }
                        } catch (RemoteException e4) {
                            f4a.d(e4);
                        }
                    } catch (RemoteException e5) {
                        f4a.d(e5);
                    }
                } catch (RemoteException e6) {
                    f4a.d(e6);
                }
            }
        };
        if (Looper.getMainLooper() != Looper.myLooper()) {
            ore.k("getMapAsync() must be called on the main thread");
            return;
        }
        d0c d0cVar = this.a;
        r6a r6aVar = (r6a) d0cVar.a;
        if (r6aVar != null) {
            r6aVar.C(vtbVar);
        } else {
            ((ArrayList) d0cVar.h).add(vtbVar);
        }
    }

    public final void b(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            d0c d0cVar = this.a;
            d0cVar.getClass();
            d0cVar.l(bundle, new xkk(d0cVar, bundle));
            if (((r6a) d0cVar.a) == null) {
                d0c.h(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void c() {
        this.c = null;
        this.d = null;
        this.f = null;
        this.g = null;
        this.i = null;
        d0c d0cVar = this.a;
        r6a r6aVar = (r6a) d0cVar.a;
        if (r6aVar == null) {
            while (!((LinkedList) d0cVar.c).isEmpty() && ((plk) ((LinkedList) d0cVar.c).getLast()).a() >= 1) {
                ((LinkedList) d0cVar.c).removeLast();
            }
        } else {
            try {
                bpl bplVar = (bpl) r6aVar.b;
                bplVar.m0(5, bplVar.l0());
            } catch (RemoteException e) {
                f4a.d(e);
            }
        }
    }

    public final void d(Bundle bundle) {
        d0c d0cVar = this.a;
        r6a r6aVar = (r6a) d0cVar.a;
        if (r6aVar == null) {
            Bundle bundle2 = (Bundle) d0cVar.b;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
                return;
            }
            return;
        }
        try {
            Bundle bundle3 = new Bundle();
            kuk.d(bundle, bundle3);
            bpl bplVar = (bpl) r6aVar.b;
            Parcel parcelL0 = bplVar.l0();
            duk.c(parcelL0, bundle3);
            Parcel parcelK0 = bplVar.k0(7, parcelL0);
            if (parcelK0.readInt() != 0) {
                bundle3.readFromParcel(parcelK0);
            }
            parcelK0.recycle();
            kuk.d(bundle3, bundle);
        } catch (RemoteException e) {
            f4a.d(e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        c4c c4cVar;
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            c4c c4cVar2 = this.i;
            if (c4cVar2 != null) {
                PickLocationScreen pickLocationScreen = (PickLocationScreen) c4cVar2;
                ((ImageView) pickLocationScreen.i.m(pickLocationScreen, PickLocationScreen.p[4])).animate().translationY(-gm0.K(20.0f * yl5.d().getDisplayMetrics().density)).setInterpolator(pickLocationScreen.o).setDuration(200L);
            }
        } else if (numValueOf != null && numValueOf.intValue() == 1 && (c4cVar = this.i) != null) {
            PickLocationScreen pickLocationScreen2 = (PickLocationScreen) c4cVar;
            ((ImageView) pickLocationScreen2.i.m(pickLocationScreen2, PickLocationScreen.p[4])).animate().translationY(0.0f).setInterpolator(pickLocationScreen2.o).setDuration(200L);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        d0c d0cVar = this.a;
        r6a r6aVar = (r6a) d0cVar.a;
        if (r6aVar == null) {
            while (!((LinkedList) d0cVar.c).isEmpty() && ((plk) ((LinkedList) d0cVar.c).getLast()).a() >= 4) {
                ((LinkedList) d0cVar.c).removeLast();
            }
        } else {
            try {
                bpl bplVar = (bpl) r6aVar.b;
                bplVar.m0(13, bplVar.l0());
            } catch (RemoteException e) {
                f4a.d(e);
            }
        }
    }

    public final void f(kbc kbcVar) {
        urh urhVarA;
        String str = this.h;
        if (str == null) {
            return;
        }
        urh urhVar = this.c;
        if (urhVar != null) {
            urhVar.a();
        }
        wrh wrhVar = pq3.j.e(getContext()).n() ? xk6.a : yk6.a;
        po7 po7Var = this.g;
        urh urhVarA2 = null;
        if (po7Var != null) {
            vrh vrhVar = new vrh();
            vrhVar.c = 1.0f;
            vrhVar.a = new bok(wrhVar);
            vrhVar.d = false;
            vrhVar.b = true;
            urhVarA = po7Var.a(vrhVar);
        } else {
            urhVarA = null;
        }
        this.c = urhVarA;
        ix3 ix3VarA = kbcVar.A();
        ix3 ix3Var = ix3.b;
        int i = this.b;
        if (ix3VarA == ix3Var) {
            urh urhVar2 = this.d;
            if (urhVar2 != null) {
                urhVar2.a();
            }
            this.d = null;
            po7 po7Var2 = this.g;
            if (po7Var2 != null) {
                vrh vrhVar2 = new vrh();
                vrhVar2.b = true;
                vrhVar2.a = new bok(new ur7(str, i, false));
                vrhVar2.d = true;
                vrhVar2.c = Float.MAX_VALUE;
                urhVarA2 = po7Var2.a(vrhVar2);
            }
            this.f = urhVarA2;
            return;
        }
        urh urhVar3 = this.f;
        if (urhVar3 != null) {
            urhVar3.a();
        }
        this.f = null;
        po7 po7Var3 = this.g;
        if (po7Var3 != null) {
            vrh vrhVar3 = new vrh();
            vrhVar3.b = true;
            vrhVar3.a = new bok(new ur7(str, i, true));
            vrhVar3.d = true;
            vrhVar3.c = Float.MAX_VALUE;
            urhVarA2 = po7Var3.a(vrhVar3);
        }
        this.d = urhVarA2;
    }

    public final void setOnMapTouchListener(c4c c4cVar) {
        this.i = c4cVar;
    }
}
