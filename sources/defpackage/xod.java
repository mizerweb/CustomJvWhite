package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class xod extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ apd g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xod(apd apdVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = apdVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        apd apdVar = this.g;
        switch (i) {
            case 0:
                xod xodVar = new xod(apdVar, lq4Var, 0);
                xodVar.f = obj;
                return xodVar;
            case 1:
                xod xodVar2 = new xod(apdVar, lq4Var, 1);
                xodVar2.f = obj;
                return xodVar2;
            case 2:
                xod xodVar3 = new xod(apdVar, lq4Var, 2);
                xodVar3.f = obj;
                return xodVar3;
            case 3:
                xod xodVar4 = new xod(apdVar, lq4Var, 3);
                xodVar4.f = obj;
                return xodVar4;
            default:
                xod xodVar5 = new xod(apdVar, lq4Var, 4);
                xodVar5.f = obj;
                return xodVar5;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((xod) create((yz5) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((xod) create((rbb) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((xod) create((vod) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((xod) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((xod) create((tnd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object poeVar;
        int i = this.e;
        sbi sbiVar = sbi.a;
        apd apdVar = this.g;
        switch (i) {
            case 0:
                yz5 yz5Var = (yz5) this.f;
                ch3.d0(obj);
                apdVar.l.setValue(yz5Var.a);
                apdVar.j.setValue(yz5Var.b);
                break;
            case 1:
                rbb rbbVar = (rbb) this.f;
                ch3.d0(obj);
                a8j.x(apdVar.n, rbbVar);
                break;
            case 2:
                vod vodVar = (vod) this.f;
                ch3.d0(obj);
                a8j.x(apdVar.o, vodVar);
                break;
            case 3:
                gu4 gu4Var = (gu4) this.f;
                ch3.d0(obj);
                ny8 ny8Var = apdVar.f;
                AtomicReference atomicReference = apdVar.q;
                try {
                    atomicReference.set(String.valueOf(System.currentTimeMillis()));
                    Uri uriFromFile = Uri.fromFile(((ju6) ny8Var.getValue()).t((String) atomicReference.get()));
                    if (!uriFromFile.toString().startsWith("content://")) {
                        uriFromFile = ((ju6) ny8Var.getValue()).i((Context) apdVar.g.getValue(), u1m.b(uriFromFile));
                    }
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    intent.putExtra("output", uriFromFile);
                    intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
                    poeVar = intent;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Throwable thA = roe.a(poeVar);
                if (thA != null) {
                    gm0.V(gu4Var.getClass().getName(), "capturePhoto: failed to capture photo", thA);
                    atomicReference.set(null);
                    a8j.x(apdVar.o, new uod(new tnh(R.string.oneme_profile_edit_cant_open_camera), Integer.valueOf(R.drawable.icon_warning)));
                }
                if (!(poeVar instanceof poe)) {
                    a8j.x(apdVar.n, new fod((Intent) poeVar));
                }
                break;
            default:
                zz5 zz5Var = apdVar.c;
                ic6 ic6Var = apdVar.o;
                tnd tndVar = (tnd) this.f;
                ch3.d0(obj);
                if (tndVar instanceof snd) {
                    snd sndVar = (snd) tndVar;
                    Long l = sndVar.a;
                    ynh ynhVar = sndVar.b;
                    Integer numValueOf = Integer.valueOf(R.drawable.icon_warning);
                    long j = zz5Var.o.get();
                    if (l == null || l.longValue() != j) {
                        long j2 = zz5Var.n.get();
                        if (l == null || l.longValue() != j2) {
                            long j3 = zz5Var.f.get();
                            if (l == null || l.longValue() != j3) {
                                long j4 = zz5Var.g.get();
                                if (l != null && l.longValue() == j4) {
                                    zz5Var.c.setValue(zz5Var.f().b(zz5Var));
                                    a8j.x(ic6Var, new uod(ynhVar, numValueOf));
                                } else if (l == null) {
                                    a8j.x(ic6Var, new uod(ynhVar, numValueOf));
                                }
                            } else {
                                zz5Var.c.setValue(zz5Var.f().b(zz5Var));
                                a8j.x(ic6Var, new uod(ynhVar, numValueOf));
                            }
                        } else {
                            a8j.x(ic6Var, new uod(ynhVar, numValueOf));
                        }
                    } else {
                        yab.i0(apdVar.b, ((n0c) ((xhh) apdVar.d.getValue())).b(), 0, new yod(apdVar, null, 0), 2);
                        a8j.x(ic6Var, new uod(ynhVar, numValueOf));
                    }
                } else if (tndVar instanceof pnd) {
                    Long l2 = new Long(((pnd) tndVar).a);
                    if (l2.longValue() == zz5Var.o.get()) {
                        a8j.x(ic6Var, new uod(new tnh(R.string.oneme_profile_edit_change_avatar_success), Integer.valueOf(R.drawable.icon_check)));
                    }
                } else if (tndVar instanceof rnd) {
                    a8j.x(ic6Var, new uod(new tnh(R.string.oneme_profile_edit_change_avatar_success), new Integer(R.drawable.icon_check)));
                }
                break;
        }
        return sbiVar;
    }
}
