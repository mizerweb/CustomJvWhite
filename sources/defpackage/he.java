package defpackage;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.me.devmenu.DevMenuFeatureTogglesPageScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class he implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ he(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object b(lq4 lq4Var, Object obj) {
        qe3 qe3Var;
        if (lq4Var instanceof qe3) {
            qe3Var = (qe3) lq4Var;
            int i = qe3Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                qe3Var.e = i - Integer.MIN_VALUE;
            } else {
                qe3Var = new qe3(this, lq4Var);
            }
        } else {
            qe3Var = new qe3(this, lq4Var);
        }
        Object obj2 = qe3Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = qe3Var.e;
        if (i2 == 0) {
            ch3.d0(obj2);
            yx6 yx6Var = (yx6) this.b;
            if (((Boolean) ((se3) this.c).d.invoke()).booleanValue() && !((se3) this.c).j) {
                qe3Var.e = 1;
                if (yx6Var.emit(obj, qe3Var) == hu4Var) {
                    return hu4Var;
                }
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj2);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object d(lq4 lq4Var, Object obj) {
        p04 p04Var;
        if (lq4Var instanceof p04) {
            p04Var = (p04) lq4Var;
            int i = p04Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                p04Var.e = i - Integer.MIN_VALUE;
            } else {
                p04Var = new p04(this, lq4Var);
            }
        } else {
            p04Var = new p04(this, lq4Var);
        }
        Object obj2 = p04Var.d;
        int i2 = p04Var.e;
        if (i2 == 0) {
            ch3.d0(obj2);
            yx6 yx6Var = (yx6) this.b;
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((q04) this.c).C((n63) it.next()));
            }
            p04Var.e = 1;
            Object objEmit = yx6Var.emit(arrayList, p04Var);
            hu4 hu4Var = hu4.a;
            if (objEmit == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj2);
        }
        return sbi.a;
    }

    private final Object e(lq4 lq4Var, Object obj) {
        qb4 qb4Var = (qb4) this.b;
        mjg mjgVar = qb4Var.t;
        Boolean bool = Boolean.FALSE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
        id0 id0Var = (id0) this.c;
        a8j.x(qb4Var.p, new cb4((String) wm9.N0(id0Var.c, "REGISTER"), twk.c(id0Var.d)));
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object f(lq4 lq4Var, Object obj) {
        ri4 ri4Var;
        if (lq4Var instanceof ri4) {
            ri4Var = (ri4) lq4Var;
            int i = ri4Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ri4Var.e = i - Integer.MIN_VALUE;
            } else {
                ri4Var = new ri4(this, lq4Var);
            }
        } else {
            ri4Var = new ri4(this, lq4Var);
        }
        Object obj2 = ri4Var.d;
        int i2 = ri4Var.e;
        if (i2 == 0) {
            ch3.d0(obj2);
            yx6 yx6Var = (yx6) this.b;
            pz5 pz5VarP = vi4.p((vi4) this.c, (vg4) obj);
            ri4Var.e = 1;
            Object objEmit = yx6Var.emit(pz5VarP, ri4Var);
            hu4 hu4Var = hu4.a;
            if (objEmit == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj2);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object g(lq4 lq4Var, Object obj) {
        mj5 mj5Var;
        if (lq4Var instanceof mj5) {
            mj5Var = (mj5) lq4Var;
            int i = mj5Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                mj5Var.e = i - Integer.MIN_VALUE;
            } else {
                mj5Var = new mj5(this, lq4Var);
            }
        } else {
            mj5Var = new mj5(this, lq4Var);
        }
        Object obj2 = mj5Var.d;
        int i2 = mj5Var.e;
        if (i2 == 0) {
            ch3.d0(obj2);
            yx6 yx6Var = (yx6) this.b;
            DevMenuFeatureTogglesPageScreen devMenuFeatureTogglesPageScreen = (DevMenuFeatureTogglesPageScreen) this.c;
            zv8[] zv8VarArr = DevMenuFeatureTogglesPageScreen.k;
            ArrayList arrayListS1 = devMenuFeatureTogglesPageScreen.s1((String) obj);
            mj5Var.e = 1;
            Object objEmit = yx6Var.emit(arrayListS1, mj5Var);
            hu4 hu4Var = hu4.a;
            if (objEmit == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj2);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0167 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Object i(lq4 lq4Var, Object obj) {
        m26 m26Var;
        acc accVar;
        int i;
        Object objEmit;
        hu4 hu4Var;
        String str;
        String str2;
        if (lq4Var instanceof m26) {
            m26Var = (m26) lq4Var;
            int i2 = m26Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m26Var.e = i2 - Integer.MIN_VALUE;
            } else {
                m26Var = new m26(this, lq4Var);
            }
        } else {
            m26Var = new m26(this, lq4Var);
        }
        Object obj2 = m26Var.d;
        int i3 = m26Var.e;
        if (i3 == 0) {
            ch3.d0(obj2);
            yx6 yx6Var = (yx6) this.b;
            n16 n16Var = (n16) obj;
            p26 p26Var = (p26) this.c;
            ifh ifhVar = p26Var.E;
            zv8[] zv8VarArr = p26.W1;
            if (cqk.d(n16Var, j16.a) || cqk.d(n16Var, l16.a)) {
                accVar = new acc(null, new jcc(R.drawable.avd_download, (Drawable) ifhVar.getValue(), null, "M5.295 9.68a1 1 0 1 1 1.41-1.419l4.308 4.279V3a1 1 0 1 1 2 0v9.532l4.28-4.27a1 1 0 0 1 1.413 1.417L12.72 15.65a1 1 0 0 1-1.411 0.002z M2.074 14.037A0.974 0.974 0 0 1 3.056 13c0.538 0 0.978 0.425 1.018 0.962 0.066 0.89 0.17 1.715 0.289 2.446a3.855 3.855 0 0 0 3.221 3.223A28 28 0 0 0 11.994 20c1.644 0 3.17-0.166 4.422-0.371a3.85 3.85 0 0 0 3.215-3.209c0.12-0.734 0.227-1.563 0.294-2.459A1.03 1.03 0 0 1 20.943 13a0.974 0.974 0 0 1 0.982 1.037 31 31 0 0 1-0.32 2.705 5.85 5.85 0 0 1-4.866 4.86C15.404 21.821 13.769 22 11.994 22c-1.769 0-3.4-0.178-4.731-0.395a5.855 5.855 0 0 1-4.875-4.88 31 31 0 0 1-0.314-2.688", p26Var.C, new m06(p26Var, 2), 56), null);
            } else {
                if (cqk.d(n16Var, k16.a)) {
                    accVar = new acc(null, new jcc(R.drawable.icon_check, null, null, "M21.707 5.293a1 1 0 0 1 0 1.414l-12 12a1 1 0 0 1-1.414 0l-6-6a1 1 0 1 1 1.414-1.414L9 16.586 20.293 5.293a1 1 0 0 1 1.414 0", p26Var.C, new m06(p26Var, 3), 58), null);
                    i = 1;
                } else {
                    if (!(n16Var instanceof m16)) {
                        ore.o();
                        return null;
                    }
                    m16 m16Var = (m16) n16Var;
                    int i4 = m16Var.a;
                    if (i4 == R.drawable.icon_play) {
                        str = "M7.25 12c0 1.303 0.084 3.05 0.192 4.735 0.064 1.009 0.109 1.648 0.178 2.093 0.406-0.177 0.961-0.477 1.833-0.956 1.17-0.642 2.317-1.307 3.182-1.88 1.104-0.732 2.573-1.821 3.93-2.86 0.704-0.538 1.136-0.874 1.418-1.133-0.282-0.258-0.714-0.594-1.417-1.132-1.358-1.039-2.827-2.128-3.93-2.86-0.866-0.573-2.013-1.238-3.183-1.88C8.582 5.648 8.026 5.348 7.62 5.171 7.55 5.616 7.506 6.255 7.442 7.264 7.334 8.949 7.25 10.696 7.25 11.999m-1.804 4.863c-0.109-1.694-0.197-3.493-0.196-4.864 0-1.37 0.088-3.169 0.196-4.863 0.148-2.325 0.222-3.488 1.078-3.958s1.868 0.085 3.891 1.195c1.186 0.651 2.39 1.348 3.325 1.967 1.164 0.772 2.678 1.896 4.041 2.94 1.605 1.227 2.407 1.841 2.407 2.72 0 0.877-0.802 1.492-2.407 2.72-1.363 1.043-2.877 2.167-4.04 2.939-0.935 0.62-2.14 1.316-3.326 1.967-2.023 1.11-3.035 1.666-3.89 1.195-0.857-0.47-0.93-1.633-1.08-3.958";
                    } else if (i4 == R.drawable.icon_pause) {
                        str = "M5.028 12.384c0 2.202-0.001 4.421 0.165 6.616 0.113 1.483 1.51 1.67 2.807 1.666 1.295-0.005 2.694-0.184 2.807-1.666 0.166-2.195 0.166-4.414 0.165-6.616v-0.776c0-2.2 0.001-4.417-0.165-6.608C10.694 3.517 9.294 3.339 8 3.334 6.704 3.33 5.306 3.517 5.193 5c-0.166 2.191-0.166 4.409-0.165 6.608zm2-0.755c0-2.137-0.001-4.206 0.142-6.244a4.7 4.7 0 0 1 0.822-0.05c0.28 0 0.562 0.006 0.838 0.054 0.143 2.037 0.143 4.105 0.142 6.24v0.734c0 2.137 0.001 4.209-0.142 6.248a5 5 0 0 1-0.838 0.055 4.7 4.7 0 0 1-0.822-0.05c-0.143-2.041-0.143-4.114-0.142-6.253zM13 12.384c0 2.202-0.001 4.421 0.165 6.616 0.113 1.483 1.51 1.67 2.807 1.666 1.295-0.005 2.695-0.184 2.807-1.666 0.167-2.195 0.166-4.414 0.165-6.616v-0.776c0.001-2.2 0.002-4.417-0.165-6.608-0.113-1.483-1.513-1.661-2.807-1.666C14.676 3.329 13.278 3.517 13.165 5 13 7.19 13 9.409 13 11.608zm2-0.755c0-2.137 0-4.206 0.143-6.244 0.27-0.048 0.548-0.052 0.822-0.05 0.279 0 0.562 0.006 0.837 0.054 0.143 2.037 0.143 4.105 0.142 6.24v0.734c0 2.137 0.001 4.209-0.142 6.248a5 5 0 0 1-0.837 0.055 4.7 4.7 0 0 1-0.822-0.05C14.999 16.575 15 14.502 15 12.363z";
                    } else if (i4 == R.drawable.icon_sound) {
                        str = "M15.633 10.005c-0.46-0.4-0.7-1.162-0.286-1.607 0.237-0.254 0.62-0.334 0.916-0.15 1.264 0.79 2.103 2.174 2.103 3.75a4.41 4.41 0 0 1-2.103 3.749c-0.297 0.184-0.68 0.105-0.916-0.15-0.413-0.445-0.173-1.207 0.286-1.607q0.066-0.057 0.128-0.119a2.63 2.63 0 0 0 0.782-1.726l0.004-0.147c0-0.793-0.353-1.504-0.914-1.993 M20.182 11.998c0-2.27-1.242-4.255-3.098-5.342-0.537-0.315-0.723-1.056-0.293-1.501a0.82 0.82 0 0 1 0.973-0.167C20.289 6.35 22 8.978 22 11.998q0 0.138-0.005 0.274v0.007c-0.103 2.9-1.785 5.409-4.23 6.728a0.82 0.82 0 0 1-0.974-0.167c-0.43-0.445-0.244-1.186 0.293-1.501l0.012-0.007c1.733-1.02 2.928-2.825 3.071-4.912z M21.995 12.272c-0.1 2.904-1.782 5.415-4.23 6.735 2.445-1.32 4.127-3.827 4.23-6.728z M11.932 4.15c-1.335-0.488-2.123 0.248-3.7 1.72Q8.066 6.026 7.909 6.19c-0.6 0.625-1.324 1.441-2.033 2.263L5.641 8.465C4.053 8.55 3.259 8.593 2.637 9.23 2.017 9.867 2.011 10.559 2 11.943v0.114c0.01 1.384 0.016 2.076 0.637 2.713 0.576 0.59 1.3 0.67 2.665 0.746l0.573 0.03a62 62 0 0 0 2.034 2.265q0.158 0.163 0.324 0.318l0.286 0.268c1.39 1.292 2.161 1.91 3.413 1.453 1.336-0.489 1.455-1.746 1.692-4.26 0.114-1.2 0.195-2.453 0.195-3.59s-0.081-2.39-0.195-3.59c-0.237-2.514-0.356-3.771-1.692-4.26m-0.298 4.448c0.11 1.165 0.184 2.35 0.184 3.402 0 1.05-0.075 2.236-0.185 3.401-0.06 0.641-0.108 1.146-0.167 1.575-0.06 0.432-0.118 0.703-0.176 0.88a1 1 0 0 1-0.042 0.102l-0.006 0.014-0.057 0.017-0.008 0.002-0.012-0.005-0.032-0.015a3.6 3.6 0 0 1-0.551-0.408c-0.272-0.23-0.58-0.517-0.984-0.895a6 6 0 0 1-0.245-0.241A60 60 0 0 1 7.39 14.24l-0.562-0.651-0.86-0.04-0.22-0.011c-0.855-0.046-1.269-0.075-1.556-0.136a1 1 0 0 1-0.129-0.036l-0.004-0.022-0.003-0.022a3 3 0 0 1-0.041-0.433C4.005 12.662 4.003 12.397 4 12.041v-0.083c0.003-0.356 0.005-0.62 0.015-0.847a3 3 0 0 1 0.045-0.458q0-0.013 0.003-0.021a1 1 0 0 1 0.13-0.035c0.286-0.061 0.7-0.09 1.555-0.135l0.22-0.012 0.86-0.04 0.562-0.651a59 59 0 0 1 1.963-2.186q0.116-0.12 0.245-0.241c0.404-0.378 0.712-0.664 0.984-0.896a3.7 3.7 0 0 1 0.55-0.407l0.037-0.018 0.008-0.003 0.01 0.002 0.056 0.017 0.002 0.005q0.019 0.035 0.045 0.112c0.058 0.177 0.117 0.448 0.176 0.88 0.059 0.429 0.107 0.934 0.168 1.574";
                    } else {
                        str = i4 == R.drawable.icon_sound_crossed ? "M4.707 3.293a1 1 0 0 0-1.414 1.414l3.339 3.34c-1.502 0.085-2.298 0.176-2.93 0.84C3.018 9.603 3.012 10.381 3 11.938v0.129c0.012 1.557 0.018 2.335 0.701 3.052 0.683 0.716 1.557 0.764 3.304 0.86l0.258 0.014c0.78 0.924 1.577 1.842 2.237 2.547q0.173 0.183 0.356 0.358c1.733 1.657 2.6 2.485 4.07 1.936 1.272-0.477 1.54-1.602 1.76-3.735l3.607 3.608a1 1 0 0 0 1.414-1.414zm9.14 11.968L8.378 9.792 8.23 9.968 7.359 10.01l-0.244 0.012c-0.936 0.052-1.405 0.084-1.736 0.155-0.201 0.044-0.22 0.075-0.228 0.086L5.15 10.265l-0.002 0.002a0.4 0.4 0 0 0-0.046 0.058 0.5 0.5 0 0 0-0.036 0.135c-0.05 0.267-0.06 0.647-0.066 1.49v0.105c0.007 0.842 0.016 1.223 0.066 1.49a0.5 0.5 0 0 0 0.036 0.135l0.007 0.012a0.4 0.4 0 0 0 0.04 0.046l0.002 0.003c0.007 0.012 0.027 0.043 0.228 0.086 0.33 0.072 0.8 0.104 1.736 0.155l0.243 0.013 0.871 0.042 0.562 0.666a67 67 0 0 0 2.168 2.469q0.132 0.14 0.279 0.28c0.443 0.424 0.785 0.75 1.09 1.014 0.304 0.265 0.503 0.406 0.639 0.482 0.06 0.034 0.096 0.048 0.113 0.054a0.7 0.7 0 0 0 0.22-0.075 1 1 0 0 0 0.104-0.246c0.166-0.517 0.251-1.314 0.39-2.824q0.03-0.297 0.053-0.596 M13.925 3.172c-1.445-0.54-2.308 0.252-3.986 1.856a1.003 1.003 0 0 0 1.36 1.465q0.052-0.044 0.099-0.093c0.367-0.35 0.662-0.63 0.929-0.86 0.305-0.265 0.504-0.406 0.64-0.483a1 1 0 0 1 0.113-0.053 0.7 0.7 0 0 1 0.22 0.075 1 1 0 0 1 0.104 0.246c0.166 0.517 0.251 1.314 0.39 2.824 0.057 0.603 0.104 1.212 0.14 1.81 0.012 0.21 0.092 0.526 0.293 0.726a1 1 0 0 0 1.706-0.724 57 57 0 0 0-0.146-1.996c-0.262-2.83-0.393-4.243-1.862-4.793" : null;
                    }
                    jcc jccVar = new jcc(i4, null, null, str, p26Var.D, new m06(p26Var, 4), 58);
                    int i5 = m16Var.b;
                    if (i5 == R.drawable.icon_play) {
                        str2 = "M7.25 12c0 1.303 0.084 3.05 0.192 4.735 0.064 1.009 0.109 1.648 0.178 2.093 0.406-0.177 0.961-0.477 1.833-0.956 1.17-0.642 2.317-1.307 3.182-1.88 1.104-0.732 2.573-1.821 3.93-2.86 0.704-0.538 1.136-0.874 1.418-1.133-0.282-0.258-0.714-0.594-1.417-1.132-1.358-1.039-2.827-2.128-3.93-2.86-0.866-0.573-2.013-1.238-3.183-1.88C8.582 5.648 8.026 5.348 7.62 5.171 7.55 5.616 7.506 6.255 7.442 7.264 7.334 8.949 7.25 10.696 7.25 11.999m-1.804 4.863c-0.109-1.694-0.197-3.493-0.196-4.864 0-1.37 0.088-3.169 0.196-4.863 0.148-2.325 0.222-3.488 1.078-3.958s1.868 0.085 3.891 1.195c1.186 0.651 2.39 1.348 3.325 1.967 1.164 0.772 2.678 1.896 4.041 2.94 1.605 1.227 2.407 1.841 2.407 2.72 0 0.877-0.802 1.492-2.407 2.72-1.363 1.043-2.877 2.167-4.04 2.939-0.935 0.62-2.14 1.316-3.326 1.967-2.023 1.11-3.035 1.666-3.89 1.195-0.857-0.47-0.93-1.633-1.08-3.958";
                    } else if (i5 == R.drawable.icon_pause) {
                        str2 = "M5.028 12.384c0 2.202-0.001 4.421 0.165 6.616 0.113 1.483 1.51 1.67 2.807 1.666 1.295-0.005 2.694-0.184 2.807-1.666 0.166-2.195 0.166-4.414 0.165-6.616v-0.776c0-2.2 0.001-4.417-0.165-6.608C10.694 3.517 9.294 3.339 8 3.334 6.704 3.33 5.306 3.517 5.193 5c-0.166 2.191-0.166 4.409-0.165 6.608zm2-0.755c0-2.137-0.001-4.206 0.142-6.244a4.7 4.7 0 0 1 0.822-0.05c0.28 0 0.562 0.006 0.838 0.054 0.143 2.037 0.143 4.105 0.142 6.24v0.734c0 2.137 0.001 4.209-0.142 6.248a5 5 0 0 1-0.838 0.055 4.7 4.7 0 0 1-0.822-0.05c-0.143-2.041-0.143-4.114-0.142-6.253zM13 12.384c0 2.202-0.001 4.421 0.165 6.616 0.113 1.483 1.51 1.67 2.807 1.666 1.295-0.005 2.695-0.184 2.807-1.666 0.167-2.195 0.166-4.414 0.165-6.616v-0.776c0.001-2.2 0.002-4.417-0.165-6.608-0.113-1.483-1.513-1.661-2.807-1.666C14.676 3.329 13.278 3.517 13.165 5 13 7.19 13 9.409 13 11.608zm2-0.755c0-2.137 0-4.206 0.143-6.244 0.27-0.048 0.548-0.052 0.822-0.05 0.279 0 0.562 0.006 0.837 0.054 0.143 2.037 0.143 4.105 0.142 6.24v0.734c0 2.137 0.001 4.209-0.142 6.248a5 5 0 0 1-0.837 0.055 4.7 4.7 0 0 1-0.822-0.05C14.999 16.575 15 14.502 15 12.363z";
                    } else if (i5 == R.drawable.icon_sound) {
                        str2 = "M15.633 10.005c-0.46-0.4-0.7-1.162-0.286-1.607 0.237-0.254 0.62-0.334 0.916-0.15 1.264 0.79 2.103 2.174 2.103 3.75a4.41 4.41 0 0 1-2.103 3.749c-0.297 0.184-0.68 0.105-0.916-0.15-0.413-0.445-0.173-1.207 0.286-1.607q0.066-0.057 0.128-0.119a2.63 2.63 0 0 0 0.782-1.726l0.004-0.147c0-0.793-0.353-1.504-0.914-1.993 M20.182 11.998c0-2.27-1.242-4.255-3.098-5.342-0.537-0.315-0.723-1.056-0.293-1.501a0.82 0.82 0 0 1 0.973-0.167C20.289 6.35 22 8.978 22 11.998q0 0.138-0.005 0.274v0.007c-0.103 2.9-1.785 5.409-4.23 6.728a0.82 0.82 0 0 1-0.974-0.167c-0.43-0.445-0.244-1.186 0.293-1.501l0.012-0.007c1.733-1.02 2.928-2.825 3.071-4.912z M21.995 12.272c-0.1 2.904-1.782 5.415-4.23 6.735 2.445-1.32 4.127-3.827 4.23-6.728z M11.932 4.15c-1.335-0.488-2.123 0.248-3.7 1.72Q8.066 6.026 7.909 6.19c-0.6 0.625-1.324 1.441-2.033 2.263L5.641 8.465C4.053 8.55 3.259 8.593 2.637 9.23 2.017 9.867 2.011 10.559 2 11.943v0.114c0.01 1.384 0.016 2.076 0.637 2.713 0.576 0.59 1.3 0.67 2.665 0.746l0.573 0.03a62 62 0 0 0 2.034 2.265q0.158 0.163 0.324 0.318l0.286 0.268c1.39 1.292 2.161 1.91 3.413 1.453 1.336-0.489 1.455-1.746 1.692-4.26 0.114-1.2 0.195-2.453 0.195-3.59s-0.081-2.39-0.195-3.59c-0.237-2.514-0.356-3.771-1.692-4.26m-0.298 4.448c0.11 1.165 0.184 2.35 0.184 3.402 0 1.05-0.075 2.236-0.185 3.401-0.06 0.641-0.108 1.146-0.167 1.575-0.06 0.432-0.118 0.703-0.176 0.88a1 1 0 0 1-0.042 0.102l-0.006 0.014-0.057 0.017-0.008 0.002-0.012-0.005-0.032-0.015a3.6 3.6 0 0 1-0.551-0.408c-0.272-0.23-0.58-0.517-0.984-0.895a6 6 0 0 1-0.245-0.241A60 60 0 0 1 7.39 14.24l-0.562-0.651-0.86-0.04-0.22-0.011c-0.855-0.046-1.269-0.075-1.556-0.136a1 1 0 0 1-0.129-0.036l-0.004-0.022-0.003-0.022a3 3 0 0 1-0.041-0.433C4.005 12.662 4.003 12.397 4 12.041v-0.083c0.003-0.356 0.005-0.62 0.015-0.847a3 3 0 0 1 0.045-0.458q0-0.013 0.003-0.021a1 1 0 0 1 0.13-0.035c0.286-0.061 0.7-0.09 1.555-0.135l0.22-0.012 0.86-0.04 0.562-0.651a59 59 0 0 1 1.963-2.186q0.116-0.12 0.245-0.241c0.404-0.378 0.712-0.664 0.984-0.896a3.7 3.7 0 0 1 0.55-0.407l0.037-0.018 0.008-0.003 0.01 0.002 0.056 0.017 0.002 0.005q0.019 0.035 0.045 0.112c0.058 0.177 0.117 0.448 0.176 0.88 0.059 0.429 0.107 0.934 0.168 1.574";
                    } else {
                        str2 = i5 == R.drawable.icon_sound_crossed ? "M4.707 3.293a1 1 0 0 0-1.414 1.414l3.339 3.34c-1.502 0.085-2.298 0.176-2.93 0.84C3.018 9.603 3.012 10.381 3 11.938v0.129c0.012 1.557 0.018 2.335 0.701 3.052 0.683 0.716 1.557 0.764 3.304 0.86l0.258 0.014c0.78 0.924 1.577 1.842 2.237 2.547q0.173 0.183 0.356 0.358c1.733 1.657 2.6 2.485 4.07 1.936 1.272-0.477 1.54-1.602 1.76-3.735l3.607 3.608a1 1 0 0 0 1.414-1.414zm9.14 11.968L8.378 9.792 8.23 9.968 7.359 10.01l-0.244 0.012c-0.936 0.052-1.405 0.084-1.736 0.155-0.201 0.044-0.22 0.075-0.228 0.086L5.15 10.265l-0.002 0.002a0.4 0.4 0 0 0-0.046 0.058 0.5 0.5 0 0 0-0.036 0.135c-0.05 0.267-0.06 0.647-0.066 1.49v0.105c0.007 0.842 0.016 1.223 0.066 1.49a0.5 0.5 0 0 0 0.036 0.135l0.007 0.012a0.4 0.4 0 0 0 0.04 0.046l0.002 0.003c0.007 0.012 0.027 0.043 0.228 0.086 0.33 0.072 0.8 0.104 1.736 0.155l0.243 0.013 0.871 0.042 0.562 0.666a67 67 0 0 0 2.168 2.469q0.132 0.14 0.279 0.28c0.443 0.424 0.785 0.75 1.09 1.014 0.304 0.265 0.503 0.406 0.639 0.482 0.06 0.034 0.096 0.048 0.113 0.054a0.7 0.7 0 0 0 0.22-0.075 1 1 0 0 0 0.104-0.246c0.166-0.517 0.251-1.314 0.39-2.824q0.03-0.297 0.053-0.596 M13.925 3.172c-1.445-0.54-2.308 0.252-3.986 1.856a1.003 1.003 0 0 0 1.36 1.465q0.052-0.044 0.099-0.093c0.367-0.35 0.662-0.63 0.929-0.86 0.305-0.265 0.504-0.406 0.64-0.483a1 1 0 0 1 0.113-0.053 0.7 0.7 0 0 1 0.22 0.075 1 1 0 0 1 0.104 0.246c0.166 0.517 0.251 1.314 0.39 2.824 0.057 0.603 0.104 1.212 0.14 1.81 0.012 0.21 0.092 0.526 0.293 0.726a1 1 0 0 0 1.706-0.724 57 57 0 0 0-0.146-1.996c-0.262-2.83-0.393-4.243-1.862-4.793" : null;
                    }
                    accVar = new acc(new jcc(i5, null, null, str2, p26Var.C, new m06(p26Var, 1), 58), new jcc(R.drawable.avd_download, (Drawable) ifhVar.getValue(), null, "M5.295 9.68a1 1 0 1 1 1.41-1.419l4.308 4.279V3a1 1 0 1 1 2 0v9.532l4.28-4.27a1 1 0 0 1 1.413 1.417L12.72 15.65a1 1 0 0 1-1.411 0.002z M2.074 14.037A0.974 0.974 0 0 1 3.056 13c0.538 0 0.978 0.425 1.018 0.962 0.066 0.89 0.17 1.715 0.289 2.446a3.855 3.855 0 0 0 3.221 3.223A28 28 0 0 0 11.994 20c1.644 0 3.17-0.166 4.422-0.371a3.85 3.85 0 0 0 3.215-3.209c0.12-0.734 0.227-1.563 0.294-2.459A1.03 1.03 0 0 1 20.943 13a0.974 0.974 0 0 1 0.982 1.037 31 31 0 0 1-0.32 2.705 5.85 5.85 0 0 1-4.866 4.86C15.404 21.821 13.769 22 11.994 22c-1.769 0-3.4-0.178-4.731-0.395a5.855 5.855 0 0 1-4.875-4.88 31 31 0 0 1-0.314-2.688", p26Var.C, new m06(p26Var, 2), 56), jccVar);
                }
                m26Var.e = i;
                objEmit = yx6Var.emit(accVar, m26Var);
                hu4Var = hu4.a;
                if (objEmit == hu4Var) {
                    return hu4Var;
                }
            }
            i = 1;
            m26Var.e = i;
            objEmit = yx6Var.emit(accVar, m26Var);
            hu4Var = hu4.a;
            if (objEmit == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj2);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r9.emit(r1, r0) == r5) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object j(defpackage.lq4 r8, java.lang.Object r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.hy6
            if (r0 == 0) goto L13
            r0 = r8
            hy6 r0 = (defpackage.hy6) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            hy6 r0 = new hy6
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.d
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.ch3.d0(r8)
            goto L72
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r7)
            return r4
        L31:
            int r7 = r0.i
            yx6 r9 = r0.h
            java.lang.Object r1 = r0.g
            defpackage.ch3.d0(r8)
            goto L5b
        L3b:
            defpackage.ch3.d0(r8)
            java.lang.Object r8 = r7.b
            yx6 r8 = (defpackage.yx6) r8
            java.lang.Object r7 = r7.c
            qf7 r7 = (defpackage.qf7) r7
            r0.g = r9
            r0.h = r8
            r1 = 0
            r0.i = r1
            r0.e = r3
            java.lang.Object r7 = r7.invoke(r9, r0)
            if (r7 != r5) goto L56
            goto L71
        L56:
            r6 = r8
            r8 = r7
            r7 = r1
            r1 = r9
            r9 = r6
        L5b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L72
            r0.g = r4
            r0.h = r4
            r0.i = r7
            r0.e = r2
            java.lang.Object r7 = r9.emit(r1, r0)
            if (r7 != r5) goto L72
        L71:
            return r5
        L72:
            sbi r7 = defpackage.sbi.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he.j(lq4, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:126:0x0257  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:165:0x0301  */
    /* JADX WARN: Code duplicated, block: B:187:0x0371  */
    /* JADX WARN: Code duplicated, block: B:203:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:228:0x0432  */
    /* JADX WARN: Code duplicated, block: B:230:0x043f  */
    /* JADX WARN: Code duplicated, block: B:315:0x05be  */
    /* JADX WARN: Code duplicated, block: B:335:0x0616  */
    /* JADX WARN: Code duplicated, block: B:355:0x0670  */
    /* JADX WARN: Code duplicated, block: B:371:0x06df  */
    /* JADX WARN: Code duplicated, block: B:394:0x0758  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:415:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:455:0x0889  */
    /* JADX WARN: Code duplicated, block: B:471:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:492:0x094f  */
    /* JADX WARN: Code duplicated, block: B:526:0x09cd  */
    /* JADX WARN: Code duplicated, block: B:549:0x0a38  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0359, code lost:
    
        if (r0.emit(r2, r3) == r6) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x09b5, code lost:
    
        if (r0.emit(r1, r3) == r6) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0a20, code lost:
    
        if (r0.emit(r2, r3) == r6) goto L541;
     */
    @Override // defpackage.yx6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r21, defpackage.lq4 r22) {
        /*
            Method dump skipped, instruction units count: 2850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he.emit(java.lang.Object, lq4):java.lang.Object");
    }
}
