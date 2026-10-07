package defpackage;

import android.content.ActivityNotFoundException;
import android.widget.TextView;
import java.util.List;
import one.me.login.neuroavatars.RegistrationNeuroAvatarsScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class che extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ RegistrationNeuroAvatarsScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ che(lq4 lq4Var, RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = registrationNeuroAvatarsScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen = this.g;
        switch (i) {
            case 0:
                che cheVar = new che(lq4Var, registrationNeuroAvatarsScreen, 0);
                cheVar.f = obj;
                return cheVar;
            case 1:
                che cheVar2 = new che(lq4Var, registrationNeuroAvatarsScreen, 1);
                cheVar2.f = obj;
                return cheVar2;
            case 2:
                che cheVar3 = new che(lq4Var, registrationNeuroAvatarsScreen, 2);
                cheVar3.f = obj;
                return cheVar3;
            case 3:
                che cheVar4 = new che(lq4Var, registrationNeuroAvatarsScreen, 3);
                cheVar4.f = obj;
                return cheVar4;
            default:
                che cheVar5 = new che(lq4Var, registrationNeuroAvatarsScreen, 4);
                cheVar5.f = obj;
                return cheVar5;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((che) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((che) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((che) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((che) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((che) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z = false;
        udb udbVar = null;
        switch (this.e) {
            case 0:
                RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen = this.g;
                Object obj2 = this.f;
                ch3.d0(obj);
                Object objT1 = ww3.t1((List) obj2);
                udbVar = objT1 instanceof udb ? (udb) objT1 : null;
                if (udbVar != null && registrationNeuroAvatarsScreen.getView() != null) {
                    ((kwb) registrationNeuroAvatarsScreen.i.m(registrationNeuroAvatarsScreen, RegistrationNeuroAvatarsScreen.u[2])).setAvatarUrl(udbVar.b);
                }
                return sbi.a;
            case 1:
                RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen2 = this.g;
                Object obj3 = this.f;
                ch3.d0(obj);
                eef eefVar = ((fef) obj3).a;
                z = eefVar != null;
                boolean z2 = eefVar instanceof cef;
                j8e j8eVar = registrationNeuroAvatarsScreen2.m;
                zv8[] zv8VarArr = RegistrationNeuroAvatarsScreen.u;
                ((TextView) j8eVar.m(registrationNeuroAvatarsScreen2, zv8VarArr[6])).setText((!z || z2) ? R.string.oneme_registration_neuro_avatars_choose_photo : R.string.oneme_registration_neuro_avatars_change_photo);
                oj ojVar = (oj) registrationNeuroAvatarsScreen2.j.m(registrationNeuroAvatarsScreen2, zv8VarArr[3]);
                ojVar.c = true;
                ojVar.setEnabled(z);
                return sbi.a;
            case 2:
                Object obj4 = this.f;
                ch3.d0(obj);
                hk0 hk0Var = (hk0) obj4;
                if (!cqk.d(hk0Var, ek0.a)) {
                    if (hk0Var instanceof fk0) {
                        try {
                            this.g.startActivityForResult(((fk0) hk0Var).a, 555);
                            tbb.g((tbb) this.g.o.getValue(), y3f.AVATAR_PICKER_CAMERA);
                        } catch (ActivityNotFoundException unused) {
                            String name = RegistrationNeuroAvatarsScreen.class.getName();
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                a4c.f(a4cVar, je9.g, name, "failed open camera", null, null, 8);
                            }
                            qdb qdbVar = this.g.q1().c;
                            qdbVar.n = null;
                            h8c h8cVar = (h8c) qdbVar.e.getValue();
                            h8cVar.m(new tnh(R.string.cant_open_camera));
                            h8cVar.h(new w8c(R.drawable.icon_warning));
                            h8cVar.p();
                        }
                    } else {
                        if (!(hk0Var instanceof gk0)) {
                            ore.o();
                            return null;
                        }
                        gk0 gk0Var = (gk0) hk0Var;
                        c1a.b.j(gk0Var.a, gk0Var.b, false);
                    }
                    break;
                } else {
                    RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen3 = this.g;
                    zv8[] zv8VarArr2 = RegistrationNeuroAvatarsScreen.u;
                    ((wsc) registrationNeuroAvatarsScreen3.n.getValue()).n(new svj(this.g, 1));
                }
                return sbi.a;
            case 3:
                RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen4 = this.g;
                Object obj5 = this.f;
                ch3.d0(obj);
                if (obj5 instanceof yf9) {
                    kzi kziVar = new kzi(((yf9) obj5).c, udbVar, z);
                    registrationNeuroAvatarsScreen4.a.getClass();
                    ku6.C(registrationNeuroAvatarsScreen4, kziVar);
                } else if (obj5 instanceof zf9) {
                    zf9 zf9Var = (zf9) obj5;
                    int i = zf9Var.e;
                    zv8[] zv8VarArr3 = RegistrationNeuroAvatarsScreen.u;
                    if (registrationNeuroAvatarsScreen4.p1() != null) {
                        ((pd0) registrationNeuroAvatarsScreen4.f.getValue()).a(new nd0(i));
                    }
                    kzi kziVar2 = new kzi(zf9Var.c, zf9Var.d, z);
                    registrationNeuroAvatarsScreen4.a.getClass();
                    ku6.C(registrationNeuroAvatarsScreen4, kziVar2);
                }
                zv8[] zv8VarArr4 = RegistrationNeuroAvatarsScreen.u;
                registrationNeuroAvatarsScreen4.r1(false);
                return sbi.a;
            default:
                sbi sbiVar = sbi.a;
                Object obj6 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj6;
                if (rbbVar instanceof feb) {
                    lg9 lg9Var = lg9.b;
                    lg9Var.getClass();
                    o65.c(lg9Var.b(), ":chat-list", null, null, 6);
                } else if (rbbVar instanceof i65) {
                    lg9.b.e((i65) rbbVar);
                } else if (rbbVar instanceof rt3) {
                    this.g.getRouter().D();
                }
                return sbiVar;
        }
    }
}
