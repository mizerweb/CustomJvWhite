package defpackage;

import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import one.me.profile.ProfileScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class dud extends g6g {
    public final ProfileScreen f;
    public final ny8 g;
    public final ny8 h;
    public final b1k i;

    public dud(ExecutorService executorService, ny8 ny8Var, ny8 ny8Var2, ProfileScreen profileScreen) {
        super(executorService);
        this.f = profileScreen;
        this.g = ny8Var;
        this.h = ny8Var2;
        this.i = new b1k(24, this);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x011c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0141  */
    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void u(uud uudVar, final int i) {
        View.OnClickListener aa1Var;
        Object obj;
        View.OnLongClickListener cw0Var;
        frd frdVar = (frd) ((k79) F(i));
        int i2 = 6;
        int i3 = 4;
        int i4 = 0;
        int i5 = 1;
        if (frdVar instanceof fqd) {
            aa1Var = new aeb(this, 14, (fqd) frdVar);
        } else if (frdVar instanceof wqd) {
            aa1Var = new bud(this, i4);
        } else if (frdVar instanceof vqd) {
            aa1Var = new bud(this, i5);
        } else if (frdVar instanceof iqd) {
            aa1Var = new bud(this, 2);
        } else {
            int i6 = 3;
            if (frdVar instanceof jqd) {
                aa1Var = new bud(this, i6);
            } else if (frdVar instanceof ard) {
                aa1Var = new aeb(this, 13, (ard) frdVar);
            } else if (frdVar instanceof drd) {
                aa1Var = new bud(this, i3);
            } else if (frdVar instanceof yqd) {
                aa1Var = new bud(this, 5);
            } else if (frdVar instanceof zqd) {
                aa1Var = new bud(this, i2);
            } else if (frdVar instanceof nqd) {
                aa1Var = new bud(this, 7);
            } else if (frdVar instanceof qqd) {
                aa1Var = new aeb((qqd) frdVar, 15, this);
            } else if (frdVar instanceof hqd) {
                aa1Var = new bud(this, (hqd) frdVar);
            } else if (frdVar instanceof tqd) {
                aa1Var = new aeb(this, 16, (tqd) frdVar);
            } else if (frdVar instanceof crd) {
                aa1Var = new bud(this, 9);
            } else if (frdVar instanceof kqd) {
                aa1Var = new bud(this, 10);
            } else if ((frdVar instanceof xqd) && ((Boolean) ((e5d) this.h.getValue()).i().i()).booleanValue()) {
                xqd xqdVar = (xqd) frdVar;
                u8b u8bVar = xqdVar.d;
                Object[] objArr = u8bVar.a;
                int i7 = u8bVar.b;
                int i8 = 0;
                while (true) {
                    if (i8 >= i7) {
                        obj = null;
                        break;
                    }
                    obj = objArr[i8];
                    if (((rhc) obj).a == uhc.a) {
                        break;
                    } else {
                        i8++;
                    }
                }
                rhc rhcVar = (rhc) obj;
                if (rhcVar == null || !rhcVar.a()) {
                    aa1Var = null;
                } else {
                    aa1Var = new aa1(rhcVar, this, xqdVar, i6);
                }
            } else {
                aa1Var = null;
            }
        }
        if (frdVar instanceof ard) {
            cw0Var = new cw0(i2, this);
        } else if (frdVar instanceof qqd) {
            final qqd qqdVar = (qqd) frdVar;
            int iD = qt4.D(1);
            if (iD == 0) {
                cw0Var = null;
            } else {
                if (iD != 1) {
                    ore.o();
                    return;
                }
                cw0Var = new View.OnLongClickListener() { // from class: cud
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        ProfileScreen profileScreen = this.a.f;
                        long j = qqdVar.a.a;
                        dvd dvdVarV1 = profileScreen.v1();
                        qud qudVarD = dvdVarV1.p1.D(i, j);
                        if (qudVarD == null) {
                            return true;
                        }
                        a8j.x(dvdVarV1.B, qudVarD);
                        return true;
                    }
                };
            }
        } else {
            cw0Var = null;
        }
        uudVar.B(frdVar);
        if ((frdVar instanceof lqd) || (frdVar instanceof sqd)) {
            uudVar.I(this.i);
        } else if (frdVar instanceof wqd) {
            boolean z = uudVar instanceof d69;
            d69 d69Var = z ? (d69) uudVar : null;
            if (d69Var != null) {
                ((c69) d69Var.a).setOnShareLinkClickListener(new nv4(27, new aud(this, i4)));
            }
            d69 d69Var2 = z ? (d69) uudVar : null;
            if (d69Var2 != null) {
                ((c69) d69Var2.a).setOnShareQrCodeClickListener(new ww8(i3, new a8d(17, this)));
            }
        } else if (frdVar instanceof eqd) {
            ryb rybVar = uudVar instanceof ryb ? (ryb) uudVar : null;
            if (rybVar != null) {
                ((oyb) rybVar.a).setListener(new qyb(i4, new aud(this, i5)));
            }
        }
        if (aa1Var != null) {
            uudVar.J(aa1Var);
        }
        if (cw0Var != null) {
            uudVar.K(cw0Var);
        }
    }

    @Override // defpackage.g6g, defpackage.nee
    public final int n(int i) {
        return ((frd) ((k79) F(i))).getF();
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        int i2 = 268435455 & i;
        int i3 = 0;
        int i4 = 1;
        if (i2 == 1) {
            oyb oybVar = new oyb(viewGroup.getContext());
            ryb rybVar = new ryb(oybVar);
            oybVar.setIconTintResolver(new pyb(i3));
            oybVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return rybVar;
        }
        int i5 = 2;
        if (i2 == 2) {
            cyb cybVar = new cyb(viewGroup.getContext());
            h70 h70Var = new h70(cybVar, 7);
            cybVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return h70Var;
        }
        int i6 = 4;
        if (i2 == 4) {
            return new h70(viewGroup.getContext());
        }
        if (i2 == 65536) {
            xl4 xl4Var = new xl4(viewGroup.getContext());
            h70 h70Var2 = new h70(xl4Var, i6);
            xl4Var.setId(R.id.profile_description_view);
            return h70Var2;
        }
        int i7 = 8;
        if (i2 == 8) {
            return new h70(new ia3(viewGroup.getContext()), i5);
        }
        if (i2 == 16) {
            atf atfVar = new atf(viewGroup.getContext());
            h70 h70Var3 = new h70(atfVar, i7);
            atfVar.setId(R.id.profile_phone_number_button);
            return h70Var3;
        }
        int i8 = 5;
        int i9 = 3;
        lq4 lq4Var = null;
        if (i2 == 4096) {
            TextView textView = new TextView(viewGroup.getContext());
            h70 h70Var4 = new h70(textView, i8);
            h70Var4.H();
            textView.setId(R.id.profile_debug_info_button);
            textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            textView.setGravity(16);
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            q9i.a(q9i.e, textView);
            n1g.N(new f7(i9, lq4Var, 19), textView);
            return h70Var4;
        }
        int i10 = 6;
        if (i2 == 32) {
            TextView textView2 = new TextView(viewGroup.getContext());
            h70 h70Var5 = new h70(textView2, i10);
            h70Var5.H();
            textView2.setId(R.id.profile_link_button);
            textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            textView2.setTextAlignment(5);
            textView2.setMaxLines(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            q9i.a(q9i.e, textView2);
            Drawable drawableMutate = textView2.getContext().getDrawable(R.drawable.icon_share_android).mutate();
            drawableMutate.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density));
            textView2.setCompoundDrawablePadding(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
            textView2.setCompoundDrawablesRelative(null, null, drawableMutate, null);
            n1g.N(new d3(drawableMutate, lq4Var, 18), textView2);
            return h70Var5;
        }
        if (i2 == 32768) {
            return new d69(new c69(viewGroup.getContext()));
        }
        if (i2 == 4194304) {
            return new ke(viewGroup.getContext(), 2);
        }
        if (i2 == 64) {
            return new ke(viewGroup.getContext(), 0);
        }
        if (i2 == 8388608) {
            return new h70(new atf(viewGroup.getContext()), 9);
        }
        fsf fsfVar = fsf.a;
        if (i2 == 256) {
            atf atfVar2 = new atf(viewGroup.getContext());
            h70 h70Var6 = new h70(atfVar2, i3);
            atfVar2.setId(R.id.profile_attaches_view);
            atfVar2.setModelItem(new ctf(256L, 0, new tnh(R.string.oneme_profile_attachments), null, null, new tnh(R.string.oneme_profile_attachments_descr), aql.a(R.drawable.icon_media), fsfVar, null, false, null, 1560));
            return h70Var6;
        }
        if (i2 == 1048576) {
            return new h70(new atf(viewGroup.getContext()), 10);
        }
        if (i2 == 128) {
            return new ke(viewGroup.getContext(), 3);
        }
        if (i2 == 2097152) {
            return new ke(viewGroup.getContext(), 4);
        }
        if (i2 == 16777216) {
            return new ke(viewGroup.getContext(), 1);
        }
        if (i2 == 512) {
            izb izbVar = new izb(viewGroup.getContext(), false);
            h70 h70Var7 = new h70(izbVar, i9);
            n1g.N(new n44(3, null, 0), izbVar);
            return h70Var7;
        }
        if (i2 == 2048) {
            return new ke(viewGroup.getContext(), 6);
        }
        if (i2 == 1024) {
            o0g o0gVar = new o0g(viewGroup.getContext());
            o0gVar.setShimmerBackground(n0g.a);
            return new h70(o0gVar, 12);
        }
        if (i2 == 131072) {
            return new ke(viewGroup.getContext(), 5);
        }
        if (i2 != 262144) {
            if (i2 == 524288) {
                return new zrb(viewGroup.getContext(), (e5d) this.h.getValue());
            }
            ahc.b(i, "}", "unknown item view type ");
            return null;
        }
        atf atfVar3 = new atf(viewGroup.getContext());
        h70 h70Var8 = new h70(atfVar3, i4);
        atfVar3.setModelItem(new ctf(PlaybackStateCompat.ACTION_SET_REPEAT_MODE, 0, new tnh(R.string.oneme_profile_section_channel_stats), null, null, null, aql.a(R.drawable.icon_chart), fsfVar, null, false, null, 1592));
        return h70Var8;
    }
}
