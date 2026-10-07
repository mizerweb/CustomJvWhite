package defpackage;

import android.graphics.Bitmap;
import org.apache.http.HttpStatus;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class zud extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ dvd g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zud(dvd dvdVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = dvdVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        dvd dvdVar = this.g;
        switch (i) {
            case 0:
                return new zud(dvdVar, lq4Var, 0);
            case 1:
                return new zud(dvdVar, lq4Var, 1);
            case 2:
                return new zud(dvdVar, lq4Var, 2);
            case 3:
                return new zud(dvdVar, lq4Var, 3);
            case 4:
                return new zud(dvdVar, lq4Var, 4);
            default:
                return new zud(dvdVar, lq4Var, 5);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((zud) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        String str;
        int i = this.e;
        sbi sbiVar = sbi.a;
        dvd dvdVar = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    wjd wjdVar = dvdVar.p1;
                    this.f = 1;
                    obj = wjdVar.p(this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                rt2 rt2Var = (rt2) obj;
                if (rt2Var == null) {
                    return sbiVar;
                }
                a8j.x(dvdVar.C, new xrd(rt2Var.a));
                return sbiVar;
            case 1:
                wjd wjdVar2 = dvdVar.p1;
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    if (wjdVar2.a(this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                if (!((f5d) ((wo6) dvdVar.p.getValue())).y()) {
                    a8j.x(dvdVar.B, new hud(new tnh(R.string.profile_contact_blocked_snackbar_title), new wud(dvdVar, 2)));
                    return sbiVar;
                }
                Long lJ = wjdVar2.j();
                if (lJ == null) {
                    return sbiVar;
                }
                ic6 ic6Var = dvdVar.C;
                trd.b.getClass();
                n65 n65Var = new n65();
                n65Var.a = ":complaint";
                n65Var.d(lJ, "ids");
                n65Var.d("p2p", "type");
                n65Var.d(Integer.valueOf(HttpStatus.SC_BAD_REQUEST), "source_screen");
                a8j.x(ic6Var, new jsd(new i65(n65Var.b())));
                return sbiVar;
            case 2:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    wjd wjdVar3 = dvdVar.p1;
                    this.f = 1;
                    return wjdVar3.y() == hu4Var ? hu4Var : sbiVar;
                }
                if (i4 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                long j = dvdVar.c;
                int i5 = this.f;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj);
                    } else {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                ch3.d0(obj);
                im7 im7Var = (im7) dvdVar.i.getValue();
                zzd zzdVar = new zzd(j);
                this.f = 1;
                obj = im7Var.b(zzdVar, true, 0, this);
                if (obj == hu4Var) {
                    return hu4Var;
                }
                szd szdVar = (szd) obj;
                if (szdVar == null || (bitmap = szdVar.b) == null) {
                    return sbiVar;
                }
                int height = bitmap.getHeight();
                int iOrdinal = dvdVar.d.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    str = "chat";
                } else {
                    if (iOrdinal != 2) {
                        ore.o();
                        return null;
                    }
                    str = "contact";
                }
                ic6 ic6Var2 = dvdVar.C;
                trd.b.getClass();
                a8j.x(ic6Var2, trd.p(j, str, height));
                return sbiVar;
            case 4:
                int i6 = this.f;
                if (i6 == 0) {
                    ch3.d0(obj);
                    wjd wjdVar4 = dvdVar.p1;
                    this.f = 1;
                    obj = wjdVar4.p(this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i6 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                rt2 rt2Var2 = (rt2) obj;
                if (rt2Var2 == null) {
                    return sbiVar;
                }
                a8j.x(dvdVar.C, new hsd(rt2Var2.a, kmd.LOCAL_CHAT));
                return sbiVar;
            default:
                int i7 = this.f;
                if (i7 == 0) {
                    ch3.d0(obj);
                    wjd wjdVar5 = dvdVar.p1;
                    this.f = 1;
                    return wjdVar5.G(this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i7 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
