package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class kog extends g6g {
    public final /* synthetic */ int f;
    public final Object g;
    public Object h;
    public Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kog(ExecutorService executorService, nv4 nv4Var, byte b) {
        super(executorService);
        this.f = 4;
        this.g = nv4Var;
        this.h = new ShapeDrawable(new OvalShape());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g6g
    /* JADX INFO: renamed from: K */
    public void u(s7g s7gVar, int i) {
        switch (this.f) {
            case 0:
                super.u(s7gVar, i);
                if (s7gVar instanceof xaf) {
                    ((xaf) s7gVar).i((mog) this.g);
                }
                if (s7gVar instanceof kmg) {
                    kmg kmgVar = (kmg) s7gVar;
                    kmgVar.x.setOnTouchListener(new nt1(kmgVar, 5, (mog) this.i));
                    mog mogVar = (mog) this.h;
                    View view = kmgVar.a;
                    if (mogVar == null) {
                        view.setOnLongClickListener(null);
                    } else {
                        view.setOnLongClickListener(new ro2(kmgVar, 10, mogVar));
                    }
                }
                break;
            case 3:
                k79 k79Var = (k79) F(i);
                g6e g6eVar = k79Var instanceof g6e ? (g6e) k79Var : null;
                if (g6eVar != null) {
                    h6e h6eVar = s7gVar instanceof h6e ? (h6e) s7gVar : null;
                    if (h6eVar != null) {
                        p7d p7dVar = (p7d) this.h;
                        h6eVar.B(g6eVar);
                        qe7.H(h6eVar.a, 300L, new aeb(p7dVar, 19, g6eVar));
                    }
                    break;
                }
                break;
            default:
                super.u(s7gVar, i);
                break;
        }
    }

    @Override // defpackage.g6g, defpackage.nee
    public long m(int i) {
        switch (this.f) {
            case 3:
                return ((k79) F(i)).getItemId();
            default:
                return super.m(i);
        }
    }

    @Override // defpackage.g6g, defpackage.nee
    public int n(int i) {
        switch (this.f) {
            case 3:
                return ((k79) F(i)).getF();
            default:
                return super.n(i);
        }
    }

    @Override // defpackage.g6g, defpackage.nee
    public /* bridge */ /* synthetic */ void u(lfe lfeVar, int i) {
        switch (this.f) {
            case 0:
                u((s7g) lfeVar, i);
                break;
            case 3:
                u((s7g) lfeVar, i);
                break;
            default:
                super.u(lfeVar, i);
                break;
        }
    }

    @Override // defpackage.nee
    public void v(lfe lfeVar, int i, List list) {
        switch (this.f) {
            case 1:
                s7g s7gVar = (s7g) lfeVar;
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (it.next() instanceof j8a) {
                            s7gVar.C((k79) this.d.f.get(i), ww3.B1(list));
                            break;
                        }
                    }
                }
                u(s7gVar, i);
                break;
            case 2:
                p56 p56Var = (p56) lfeVar;
                List list3 = list;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        if (it2.next() instanceof nmg) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : list3) {
                                if (obj instanceof ao2) {
                                    arrayList.add(obj);
                                }
                            }
                            ao2 ao2Var = (ao2) ww3.D1(arrayList);
                            if (ao2Var != null) {
                                p56Var.H(ao2Var.a);
                            } else {
                                u(p56Var, i);
                            }
                            break;
                        }
                    }
                }
                u(p56Var, i);
                break;
            case 3:
            default:
                super.v(lfeVar, i, list);
                break;
            case 4:
                tmg tmgVar = (tmg) lfeVar;
                List list4 = list;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        if (it3.next() instanceof nmg) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : list4) {
                                if (obj2 instanceof nmg) {
                                    arrayList2.add(obj2);
                                }
                            }
                            nmg nmgVar = (nmg) ww3.t1(arrayList2);
                            if (nmgVar == null) {
                                u(tmgVar, i);
                            } else if (nmgVar instanceof lmg) {
                                tmgVar.I(((lmg) nmgVar).a);
                            } else if (nmgVar instanceof mmg) {
                                tmgVar.H(((mmg) nmgVar).a);
                            } else {
                                ore.o();
                            }
                            break;
                        }
                    }
                }
                u(tmgVar, i);
                break;
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        switch (this.f) {
            case 0:
                if (i == R.id.oneme_stickers_settings_emoji_suggest_view_type) {
                    return new iog(new atf(viewGroup.getContext()));
                }
                if (i != R.id.oneme_stickers_settings_recent_view_type && i != R.id.oneme_stickers_settings_favorite_view_type) {
                    if (i == R.id.oneme_stickers_settings_sets_title_view_type) {
                        TextView textView = new TextView(viewGroup.getContext());
                        textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), textView.getPaddingTop(), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), textView.getPaddingBottom());
                        q9i.a(q9i.k.g(), textView);
                        n1g.N(new yvf(3, null, 2), textView);
                        return new lvf(textView, 4);
                    }
                    if (i == R.id.oneme_stickers_settings_set_view_type) {
                        return new kmg(viewGroup.getContext());
                    }
                    String name = kog.class.getName();
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, name, zo5.h(i, "unknown item viewType: "), null);
                        }
                    }
                    return new lvf(new View(viewGroup.getContext()), 5);
                }
                return new jog(viewGroup.getContext());
            case 1:
                return i == R.id.messages_list_context_actions_view_type ? new tp4(viewGroup.getContext(), (er3) this.g, (lfa) this.i) : new tp4(viewGroup.getContext(), (fz7) this.h);
            case 2:
                return new p56(viewGroup.getContext(), (ShapeDrawable) this.i, (nv4) this.g, (kbc) this.h);
            case 3:
                i6e i6eVar = (i6e) this.g;
                if (i != R.id.one_chat_reactions_expand_view_type) {
                    return new h6e(viewGroup.getContext(), i6eVar);
                }
                Context context = viewGroup.getContext();
                a8d a8dVar = new a8d(21, this);
                ImageView imageView = new ImageView(context);
                int iK = gm0.K(i6eVar.a() * yl5.d().getDisplayMetrics().density);
                imageView.setLayoutParams(new wee(iK, iK));
                qe7.H(imageView, 300L, new gwc(13, a8dVar));
                n1g.N(new np2(iK, (lq4) null, context), imageView);
                return new z91(imageView, 13);
            default:
                return new tmg(viewGroup.getContext(), (ShapeDrawable) this.h, (nv4) this.g, (kbc) this.i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kog(Executor executor, Object obj, cf7 cf7Var, uf7 uf7Var, int i) {
        super(executor);
        this.f = i;
        this.g = obj;
        this.h = cf7Var;
        this.i = uf7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kog(ExecutorService executorService, nv4 nv4Var) {
        super(executorService);
        this.f = 2;
        this.g = nv4Var;
        this.i = new ShapeDrawable(new OvalShape());
    }
}
