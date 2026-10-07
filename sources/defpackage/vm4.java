package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class vm4 extends y69 {
    public final /* synthetic */ int e = 0;
    public final Object f;
    public final Object g;

    public vm4(yi3 yi3Var, ExecutorService executorService) {
        super(new ki3(null, executorService, new k45(6)));
        this.f = yi3Var;
        this.g = executorService;
    }

    @Override // defpackage.nee
    public long m(int i) {
        switch (this.e) {
            case 0:
                return qt4.D(((wm4) F(i)).a);
            default:
                return super.m(i);
        }
    }

    @Override // defpackage.nee
    public final int n(int i) {
        switch (this.e) {
            case 0:
                int iD = qt4.D(((wm4) F(i)).a);
                if (iD != 0) {
                    return (iD == 2 || iD == 3) ? 2 : 1;
                }
                return 0;
            default:
                return R.id.chats_search_recent_view_type;
        }
    }

    @Override // defpackage.nee
    public final void u(lfe lfeVar, int i) {
        switch (this.e) {
            case 0:
                final wm4 wm4Var = (wm4) F(i);
                if (!(lfeVar instanceof xm4)) {
                    final int i2 = 1;
                    final int i3 = 0;
                    if (lfeVar instanceof vn4) {
                        final vn4 vn4Var = (vn4) lfeVar;
                        final boolean z = l() > 1;
                        y4c y4cVar = (y4c) vn4Var.a;
                        int iD = qt4.D(wm4Var.a);
                        if (iD == 2) {
                            y4cVar.setTitle(np4.q(y4cVar.getContext(), R.string.banner_middle_permit_phone_book_contacts_title));
                            y4cVar.setSubtitle(np4.q(y4cVar.getContext(), R.string.banner_middle_permit_phone_book_contacts_subtitle));
                            y4cVar.v(y4cVar.getContext().getDrawable(R.drawable.icon_user_add).mutate(), gm0.K(yl5.d().getDisplayMetrics().density * 56.0f), gm0.K(56.0f * yl5.d().getDisplayMetrics().density));
                            b0m.e(y4cVar.D, vn4.w, new float[]{0.0f, 1.0f});
                        } else if (iD == 3) {
                            y4cVar.setTitle(np4.q(y4cVar.getContext(), R.string.banner_middle_permit_notifications_title));
                            y4cVar.setSubtitle(np4.q(y4cVar.getContext(), R.string.banner_permit_notifications_subtitle));
                            y4cVar.v(y4cVar.getContext().getDrawable(R.drawable.icon_notifications).mutate(), gm0.K(yl5.d().getDisplayMetrics().density * 56.0f), gm0.K(56.0f * yl5.d().getDisplayMetrics().density));
                            b0m.e(y4cVar.D, vn4.x, new float[]{0.0f, 1.0f});
                        }
                        y4cVar.setCloseButtonVisibility(false);
                        y4cVar.setBannerClickListener(new View.OnClickListener() { // from class: an4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i4 = i2;
                                boolean z2 = z;
                                wm4 wm4Var2 = wm4Var;
                                lfe lfeVar2 = vn4Var;
                                switch (i4) {
                                    case 0:
                                        bn4 bn4Var = (bn4) lfeVar2;
                                        um4 um4Var = bn4Var.u;
                                        int i5 = wm4Var2.a;
                                        um4Var.B(i5);
                                        bn4Var.v.a(xol.b(i5), 1, z2 ? 1 : 2);
                                        break;
                                    default:
                                        vn4 vn4Var2 = (vn4) lfeVar2;
                                        um4 um4Var2 = vn4Var2.u;
                                        int i6 = wm4Var2.a;
                                        um4Var2.B(i6);
                                        vn4Var2.v.a(xol.b(i6), 2, z2 ? 1 : 2);
                                        break;
                                }
                            }
                        });
                        y4cVar.setCloseButtonClickListener(new t8(vn4Var, 23, wm4Var));
                    } else if (lfeVar instanceof bn4) {
                        final bn4 bn4Var = (bn4) lfeVar;
                        final boolean z2 = l() > 1;
                        int[] iArr = bn4.x;
                        pzb pzbVar = (pzb) bn4Var.a;
                        int iD2 = qt4.D(wm4Var.a);
                        if (iD2 == 1) {
                            pzbVar.setTitle(np4.q(pzbVar.getContext(), R.string.banner_compact_permit_phone_book_contacts_title));
                            pzbVar.setSubtitle(np4.q(pzbVar.getContext(), R.string.banner_compact_permit_phone_book_contacts_subtitle));
                            pzbVar.v(pzbVar.getContext().getDrawable(R.drawable.icon_user_add).mutate(), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
                            b0m.e(pzbVar.D, bn4.w, new float[]{0.0f, 1.0f});
                        } else if (iD2 == 4) {
                            pzbVar.setTitle(np4.q(pzbVar.getContext(), R.string.banner_compact_permit_notifications_title));
                            pzbVar.setSubtitle(np4.q(pzbVar.getContext(), R.string.banner_permit_notifications_subtitle));
                            pzbVar.v(pzbVar.getContext().getDrawable(R.drawable.icon_notifications).mutate(), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
                            b0m.e(pzbVar.D, iArr, new float[]{0.0f, 1.0f});
                        } else if (iD2 == 6) {
                            pzbVar.setTitle(np4.q(pzbVar.getContext(), R.string.banner_compact_permit_mic_title));
                            pzbVar.setSubtitle(np4.q(pzbVar.getContext(), R.string.banner_compact_permit_mic_subtitle));
                            pzbVar.v(pzbVar.getContext().getDrawable(R.drawable.icon_microphone).mutate(), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
                            b0m.e(pzbVar.D, iArr, new float[]{0.0f, 1.0f});
                        }
                        pzbVar.setCloseButtonVisibility(false);
                        pzbVar.setBannerClickListener(new View.OnClickListener() { // from class: an4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i4 = i3;
                                boolean z3 = z2;
                                wm4 wm4Var2 = wm4Var;
                                lfe lfeVar2 = bn4Var;
                                switch (i4) {
                                    case 0:
                                        bn4 bn4Var2 = (bn4) lfeVar2;
                                        um4 um4Var = bn4Var2.u;
                                        int i5 = wm4Var2.a;
                                        um4Var.B(i5);
                                        bn4Var2.v.a(xol.b(i5), 1, z3 ? 1 : 2);
                                        break;
                                    default:
                                        vn4 vn4Var2 = (vn4) lfeVar2;
                                        um4 um4Var2 = vn4Var2.u;
                                        int i6 = wm4Var2.a;
                                        um4Var2.B(i6);
                                        vn4Var2.v.a(xol.b(i6), 2, z3 ? 1 : 2);
                                        break;
                                }
                            }
                        });
                        pzbVar.setCloseButtonClickListener(new t8(bn4Var, 22, wm4Var));
                    }
                    break;
                }
                break;
            default:
                ((v9e) ((w9e) lfeVar).a).setContacts((List) F(i));
                break;
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        int i2 = this.e;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i2) {
            case 0:
                kp0 kp0Var = (kp0) obj;
                um4 um4Var = (um4) obj2;
                if (i != 0) {
                    return (i == 2 || i == 3) ? new vn4(viewGroup.getContext(), um4Var, kp0Var) : new bn4(viewGroup.getContext(), um4Var, kp0Var);
                }
                return new xm4(viewGroup.getContext(), um4Var, kp0Var);
            default:
                return new w9e(new v9e(viewGroup.getContext(), (yi3) obj2, (ExecutorService) obj));
        }
    }

    public vm4(um4 um4Var, kp0 kp0Var) {
        super(new k45(4));
        this.f = um4Var;
        this.g = kp0Var;
        D(true);
    }
}
