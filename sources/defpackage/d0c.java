package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.Layout;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.a;
import one.me.messages.list.loader.MessageModel;
import ru.ok.tamtam.messages.MessageException;
import ru.ok.tamtam.messages.b;
import ru.ok.tamtam.messages.c;

/* JADX INFO: loaded from: classes2.dex */
public final class d0c {
    public Object a;
    public Object b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public final Object h;

    public d0c(int i) {
        switch (i) {
            case 3:
                this.a = new rj5(18);
                this.b = new rj5(18);
                this.c = new rj5(18);
                this.d = new rj5(18);
                this.e = new rj5(18);
                this.f = new rj5(18);
                this.g = new rj5(18);
                this.h = new rj5(18);
                break;
            default:
                this.a = new AtomicInteger(0);
                this.b = new AtomicInteger(0);
                this.c = new AtomicInteger(0);
                this.d = new AtomicInteger(0);
                this.e = new AtomicInteger(0);
                this.f = new AtomicInteger(0);
                this.g = new AtomicInteger(0);
                this.h = new ConcurrentHashMap();
                break;
        }
    }

    public static boolean e(mm9 mm9Var, MessageModel messageModel, c cVar) {
        if (messageModel.A == xfa.ERROR) {
            return true;
        }
        u40 u40Var = messageModel.j;
        long j = u40Var.a;
        int i = v40.b;
        if ((j & 8) != 0 || u40Var.a()) {
            return true;
        }
        CharSequence charSequenceD = cVar.d(mm9Var.a);
        return (charSequenceD == null || charSequenceD.length() == 0) ? false : true;
    }

    public static final ka5 g(Context context, fwi fwiVar) {
        ka5 ka5Var = new ka5(context);
        ka5Var.c = new gwi(fwiVar.a, fwiVar.b, fwiVar.c, fwiVar.d, fwiVar.e, fwiVar.f, fwiVar.g, fwiVar.h, fwiVar.i, fwiVar.j, fwiVar.k);
        ka5Var.e = false;
        return new ka5(ka5Var);
    }

    public static void h(d4c d4cVar) {
        fo7 fo7Var = fo7.d;
        Context context = d4cVar.getContext();
        int iC = fo7Var.c(context, go7.a);
        String strC = wkk.c(context, iC);
        String strB = wkk.b(context, iC);
        LinearLayout linearLayout = new LinearLayout(d4cVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        d4cVar.addView(linearLayout);
        TextView textView = new TextView(d4cVar.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strC);
        linearLayout.addView(textView);
        Intent intentB = fo7Var.b(iC, context, null);
        if (intentB != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strB);
            linearLayout.addView(button);
            button.setOnClickListener(new x62(context, 5, intentB));
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(mm9 mm9Var, nq4 nq4Var) {
        xzb xzbVar;
        boolean z;
        boolean z2;
        int i;
        int i2;
        if (nq4Var instanceof xzb) {
            xzbVar = (xzb) nq4Var;
            int i3 = xzbVar.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xzbVar.g = i3 - Integer.MIN_VALUE;
            } else {
                xzbVar = new xzb(this, nq4Var);
            }
        } else {
            xzbVar = new xzb(this, nq4Var);
        }
        Object obj = xzbVar.e;
        int i4 = xzbVar.g;
        int i5 = 0;
        if (i4 == 0) {
            ch3.d0(obj);
            MessageModel messageModelC = mm9Var.c();
            int i6 = mm9Var.d;
            boolean z3 = messageModelC.z;
            if (mm9Var.a.d0()) {
                i = 201326592;
            } else {
                if (mm9Var.d().size() > 1 && !(mm9Var.c().j.b instanceof oxi)) {
                    Object obj2 = hu4.a;
                    if (i6 == 0) {
                        MessageModel messageModel = (MessageModel) mm9Var.d().get(0);
                        MessageModel messageModel2 = (MessageModel) mm9Var.d().get(1);
                        xzbVar.d = z3;
                        xzbVar.g = 1;
                        Object objD = d(mm9Var, messageModel, messageModel2, xzbVar);
                        if (objD != obj2) {
                            obj = objD;
                            z2 = z3;
                            if (((Boolean) obj).booleanValue()) {
                                if (z2) {
                                }
                                i2 = 268435456;
                                i = i2 | i5;
                            } else if (z2) {
                                i5 = 67108864;
                            }
                        }
                    } else if (i6 == xw3.O0(mm9Var.d())) {
                        MessageModel messageModel3 = (MessageModel) mm9Var.d().get(i6);
                        MessageModel messageModel4 = (MessageModel) mm9Var.d().get(i6 - 1);
                        xzbVar.d = z3;
                        xzbVar.g = 2;
                        Object objD2 = d(mm9Var, messageModel3, messageModel4, xzbVar);
                        if (objD2 != obj2) {
                            obj = objD2;
                            z = z3;
                            if (((Boolean) obj).booleanValue()) {
                                if (z) {
                                }
                                i2 = 1073741824;
                                i = i2 | i5;
                            } else if (z) {
                                i5 = 67108864;
                            }
                        }
                    } else {
                        xzbVar.d = z3;
                        xzbVar.g = 3;
                        Object objC = c(mm9Var, z3, xzbVar);
                        if (objC != obj2) {
                            return objC;
                        }
                    }
                    return obj2;
                }
                if (z3) {
                    i5 = 67108864;
                }
                i = i5 | 134217728;
            }
        } else if (i4 == 1) {
            z2 = xzbVar.d;
            ch3.d0(obj);
            if (((Boolean) obj).booleanValue()) {
                i5 = z2 ? 67108864 : 0;
                i2 = 268435456;
                i = i2 | i5;
            } else {
                if (z2) {
                    i5 = 67108864;
                }
                i = i5 | 134217728;
            }
        } else {
            if (i4 != 2) {
                if (i4 == 3) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = xzbVar.d;
            ch3.d0(obj);
            if (((Boolean) obj).booleanValue()) {
                i5 = z ? 67108864 : 0;
                i2 = 1073741824;
                i = i2 | i5;
            } else {
                if (z) {
                    i5 = 67108864;
                }
                i = i5 | 134217728;
            }
        }
        return new z21(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public Object b(mm9 mm9Var, int i, int i2, int i3, int i4, nq4 nq4Var) {
        yzb yzbVar;
        mm9 mm9Var2;
        mm9 mm9Var3;
        vg4 vg4Var;
        vg4 vg4Var2;
        int i5 = i3;
        int i6 = i4;
        ny8 ny8Var = (ny8) this.e;
        ifh ifhVar = (ifh) this.b;
        if (nq4Var instanceof yzb) {
            yzbVar = (yzb) nq4Var;
            int i7 = yzbVar.i;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                yzbVar.i = i7 - Integer.MIN_VALUE;
            } else {
                yzbVar = new yzb(this, nq4Var);
            }
        } else {
            yzbVar = new yzb(this, nq4Var);
        }
        Object objI = yzbVar.g;
        int i8 = yzbVar.i;
        boolean z = false;
        if (i8 != 0) {
            if (i8 == 1) {
                int i9 = yzbVar.f;
                i5 = yzbVar.e;
                mm9 mm9Var4 = yzbVar.d;
                ch3.d0(objI);
                i6 = i9;
                mm9Var3 = mm9Var4;
                vg4Var = (vg4) objI;
                if (vg4Var != null && vg4Var.G()) {
                    z = true;
                }
                ihf ihfVar = (ihf) ifhVar.getValue();
                c cVar = mm9Var3.c;
                cVar.g(cVar.a.i());
                return ihfVar.a(cVar.h, i6, z, i5, mm9Var3.c().E);
            }
            if (i8 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = yzbVar.f;
            i5 = yzbVar.e;
            mm9 mm9Var5 = yzbVar.d;
            ch3.d0(objI);
            i6 = i10;
            mm9Var2 = mm9Var5;
            vg4Var2 = (vg4) objI;
            if (vg4Var2 != null && vg4Var2.G()) {
                z = true;
            }
            ihf ihfVar2 = (ihf) ifhVar.getValue();
            c cVar2 = mm9Var2.c;
            cVar2.g(cVar2.a.i());
            return ihfVar2.a(cVar2.h, i6, z, i5, mm9Var2.c().E);
        }
        ch3.d0(objI);
        rt2 rt2Var = mm9Var.a;
        if (!rt2Var.h0()) {
            rt2Var.getClass();
            boolean z2 = rt2Var instanceof s04;
            hu4 hu4Var = hu4.a;
            if (z2 && z21.a(i) && !vka.f(i2)) {
                rt2 rt2Var2 = mm9Var.b;
                if (rt2Var2 != null) {
                    if (mm9Var.c().y) {
                        return ihf.b((ihf) ifhVar.getValue(), rt2Var2.F(), i6, rt2Var2.u0(), 24);
                    }
                    no4 no4Var = (no4) ny8Var.getValue();
                    long j = mm9Var.c().x;
                    yzbVar.d = mm9Var;
                    yzbVar.e = i5;
                    yzbVar.f = i6;
                    yzbVar.i = 1;
                    objI = no4Var.i(j);
                    if (objI != hu4Var) {
                        mm9Var3 = mm9Var;
                        vg4Var = (vg4) objI;
                        if (vg4Var != null) {
                            z = true;
                        }
                        ihf ihfVar3 = (ihf) ifhVar.getValue();
                        c cVar3 = mm9Var3.c;
                        cVar3.g(cVar3.a.i());
                        return ihfVar3.a(cVar3.h, i6, z, i5, mm9Var3.c().E);
                    }
                    return hu4Var;
                }
            } else {
                if (rt2Var.d0() && !vka.f(i2)) {
                    return ihf.b((ihf) ifhVar.getValue(), rt2Var.F(), i6, rt2Var.u0(), 24);
                }
                if (z21.a(i) && !vka.f(i2)) {
                    no4 no4Var2 = (no4) ny8Var.getValue();
                    long j2 = mm9Var.c().x;
                    yzbVar.d = mm9Var;
                    yzbVar.e = i5;
                    yzbVar.f = i6;
                    yzbVar.i = 2;
                    objI = no4Var2.i(j2);
                    if (objI != hu4Var) {
                        mm9Var2 = mm9Var;
                        vg4Var2 = (vg4) objI;
                        if (vg4Var2 != null) {
                            z = true;
                        }
                        ihf ihfVar4 = (ihf) ifhVar.getValue();
                        c cVar4 = mm9Var2.c;
                        cVar4.g(cVar4.a.i());
                        return ihfVar4.a(cVar4.h, i6, z, i5, mm9Var2.c().E);
                    }
                    return hu4Var;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(mm9 mm9Var, boolean z, nq4 nq4Var) {
        zzb zzbVar;
        boolean z2;
        boolean z3;
        boolean zBooleanValue;
        int i;
        int i2;
        if (nq4Var instanceof zzb) {
            zzbVar = (zzb) nq4Var;
            int i3 = zzbVar.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zzbVar.i = i3 - Integer.MIN_VALUE;
            } else {
                zzbVar = new zzb(this, nq4Var);
            }
        } else {
            zzbVar = new zzb(this, nq4Var);
        }
        Object objD = zzbVar.g;
        int i4 = zzbVar.i;
        Object obj = hu4.a;
        if (i4 == 0) {
            ch3.d0(objD);
            List listD = mm9Var.d();
            int i5 = mm9Var.d;
            MessageModel messageModel = (MessageModel) listD.get(i5);
            MessageModel messageModel2 = (MessageModel) mm9Var.d().get(i5 - 1);
            zzbVar.d = mm9Var;
            zzbVar.e = z;
            zzbVar.i = 1;
            objD = d(mm9Var, messageModel, messageModel2, zzbVar);
            if (objD != obj) {
            }
            return obj;
        }
        if (i4 == 1) {
            z = zzbVar.e;
            mm9Var = zzbVar.d;
            ch3.d0(objD);
        } else {
            if (i4 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = zzbVar.f;
            z3 = zzbVar.e;
            ch3.d0(objD);
        }
        zBooleanValue = ((Boolean) objD).booleanValue();
        if (z2 && !zBooleanValue) {
            i = z3 ? 67108864 : 0;
            i2 = 134217728;
        } else if (!z2) {
            i = z3 ? 67108864 : 0;
            i2 = 268435456;
        } else if (zBooleanValue) {
            i = z3 ? 67108864 : 0;
            i2 = 536870912;
        } else {
            i = z3 ? 67108864 : 0;
            i2 = 1073741824;
        }
        return new z21(i2 | i);
        boolean zBooleanValue2 = ((Boolean) objD).booleanValue();
        List listD2 = mm9Var.d();
        int i6 = mm9Var.d;
        MessageModel messageModel3 = (MessageModel) listD2.get(i6);
        MessageModel messageModel4 = (MessageModel) mm9Var.d().get(i6 + 1);
        zzbVar.d = null;
        zzbVar.e = z;
        zzbVar.f = zBooleanValue2;
        zzbVar.i = 2;
        Object objD2 = d(mm9Var, messageModel3, messageModel4, zzbVar);
        if (objD2 != obj) {
            objD = objD2;
            z2 = zBooleanValue2;
            z3 = z;
            zBooleanValue = ((Boolean) objD).booleanValue();
            if (z2) {
                if (!z2) {
                    if (z3) {
                    }
                    i2 = 268435456;
                } else if (zBooleanValue) {
                    if (z3) {
                    }
                    i2 = 536870912;
                } else {
                    if (z3) {
                    }
                    i2 = 1073741824;
                }
            } else if (!z2) {
                if (z3) {
                }
                i2 = 268435456;
            } else if (zBooleanValue) {
                if (z3) {
                }
                i2 = 536870912;
            } else {
                if (z3) {
                }
                i2 = 1073741824;
            }
            return new z21(i2 | i);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x013e  */
    /* JADX WARN: Code duplicated, block: B:64:0x018a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object d(mm9 mm9Var, MessageModel messageModel, MessageModel messageModel2, nq4 nq4Var) {
        a0c a0cVar;
        wfe wfeVar;
        boolean z;
        Object objF;
        y35 y35Var;
        c cVar;
        boolean z2;
        String str;
        a4c a4cVar;
        mm9 mm9Var2 = mm9Var;
        MessageModel messageModel3 = messageModel;
        MessageModel messageModel4 = messageModel2;
        je9 je9Var = je9.f;
        if (nq4Var instanceof a0c) {
            a0cVar = (a0c) nq4Var;
            int i = a0cVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                a0cVar.j = i - Integer.MIN_VALUE;
            } else {
                a0cVar = new a0c(this, nq4Var);
            }
        } else {
            a0cVar = new a0c(this, nq4Var);
        }
        Object obj = a0cVar.h;
        hu4 hu4Var = hu4.a;
        int i2 = a0cVar.j;
        if (i2 == 0) {
            ch3.d0(obj);
            if (messageModel4 == null || messageModel4.w() || messageModel4.p != null) {
                return Boolean.FALSE;
            }
            long j = messageModel3.c;
            if ((j < 0 && messageModel4.c > 0) || (j > 0 && messageModel4.c < 0)) {
                return Boolean.FALSE;
            }
            wfeVar = new wfe();
            b bVar = (b) ((ny8) this.d).getValue();
            rt2 rt2Var = mm9Var2.a;
            long j2 = messageModel4.a;
            if (j2 == 0) {
                bVar.getClass();
                gm0.V("PreProcessDataCache", "zero message in PreProcessDataCache", new MessageException.ZeroId());
            }
            c cVar2 = (c) (rt2Var instanceof s04 ? bVar.h : bVar.g).get(Long.valueOf(j2));
            wfeVar.a = cVar2;
            if (cVar2 == null) {
                String str2 = (String) this.a;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    long j3 = messageModel4.a;
                    long j4 = mm9Var2.a.a;
                    StringBuilder sbS = qt4.s(j3, "Trying check isMessagesInBubbleGroup with non-existed preProcessedData for other message! MsgId:", ",chatId:");
                    sbS.append(j4);
                    a4cVar2.c(je9Var, str2, sbS.toString(), null);
                }
                j44 j44Var = (j44) ((ny8) this.f).getValue();
                long j5 = messageModel4.a;
                a0cVar.d = mm9Var2;
                a0cVar.e = messageModel3;
                a0cVar.f = messageModel4;
                a0cVar.g = wfeVar;
                z = true;
                a0cVar.j = 1;
                objF = j44Var.f(j5, a0cVar);
                if (objF == hu4Var) {
                    return hu4Var;
                }
            } else {
                z = true;
            }
            if (messageModel4.a != ((c) wfeVar.a).d.a) {
                str = (String) this.a;
                a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    long j6 = messageModel4.a;
                    long j7 = ((c) wfeVar.a).d.a;
                    StringBuilder sbS2 = qt4.s(j6, "WARNING! Wrong message id in preProcessedData when try find isMessagesInBubbleGroup, \n                    |msgId:", ", \n                    |fromData msgId:");
                    sbS2.append(j7);
                    sbS2.append("\n                    |");
                    a4cVar.c(je9Var, str, s5h.y0(sbS2.toString()), null);
                }
            }
            c cVar3 = mm9Var2.c;
            cVar3.h();
            y35Var = cVar3.m;
            cVar = (c) wfeVar.a;
            cVar.h();
            if (oc9.S(y35Var, cVar.m) || messageModel3.x != messageModel4.x || e(mm9Var2, messageModel3, mm9Var2.c) || e(mm9Var2, messageModel4, (c) wfeVar.a)) {
                z2 = false;
            } else {
                z2 = z;
            }
            return Boolean.valueOf(z2);
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wfe wfeVar2 = a0cVar.g;
        MessageModel messageModel5 = a0cVar.f;
        MessageModel messageModel6 = a0cVar.e;
        mm9 mm9Var3 = a0cVar.d;
        ch3.d0(obj);
        wfeVar = wfeVar2;
        mm9Var2 = mm9Var3;
        objF = obj;
        messageModel4 = messageModel5;
        messageModel3 = messageModel6;
        z = true;
        sfa sfaVar = (sfa) objF;
        if (sfaVar == null) {
            gm0.Y((String) this.a, "PreProcessedData for message=MessageModel(" + messageModel4.a + ") is null");
            return Boolean.FALSE;
        }
        wfeVar.a = ((b) ((ny8) this.d).getValue()).f(mm9Var2.a, sfaVar);
        if (messageModel4.a != ((c) wfeVar.a).d.a) {
            str = (String) this.a;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                long j8 = messageModel4.a;
                long j9 = ((c) wfeVar.a).d.a;
                StringBuilder sbS3 = qt4.s(j8, "WARNING! Wrong message id in preProcessedData when try find isMessagesInBubbleGroup, \n                    |msgId:", ", \n                    |fromData msgId:");
                sbS3.append(j9);
                sbS3.append("\n                    |");
                a4cVar.c(je9Var, str, s5h.y0(sbS3.toString()), null);
            }
        }
        c cVar4 = mm9Var2.c;
        cVar4.h();
        y35Var = cVar4.m;
        cVar = (c) wfeVar.a;
        cVar.h();
        if (oc9.S(y35Var, cVar.m)) {
            z2 = false;
        } else {
            z2 = z;
        }
        return Boolean.valueOf(z2);
    }

    public iu3 f(Context context, n6a n6aVar) {
        Integer num;
        fwi fwiVar = new fwi();
        fwiVar.a = -1;
        boolean z = true;
        fwiVar.b = 1;
        fwiVar.c = -1;
        fwiVar.d = -1;
        fwiVar.e = 1.0f;
        fwiVar.f = -1;
        fwiVar.g = -1;
        fwiVar.h = -1L;
        fwiVar.i = -1;
        fwiVar.j = -1;
        fwiVar.k = -1;
        prk prkVar = (prk) this.b;
        if (prkVar instanceof qx9) {
            return !((Boolean) ((ny8) this.d).getValue()).booleanValue() ? new kzi(g(context, fwiVar)) : g(context, fwiVar);
        }
        if (!(prkVar instanceof tx9)) {
            ore.o();
            return null;
        }
        int iIntValue = ((Number) ((ny8) this.g).getValue()).intValue();
        n6aVar.d = iIntValue;
        if (iIntValue != 1 && iIntValue != 2) {
            z = false;
        }
        lvb.R(z);
        fwiVar.b = iIntValue;
        if (((tx9) ((prk) this.b)).e() > 0) {
            fwiVar.a = ((tx9) ((prk) this.b)).e();
        }
        xx9 xx9Var = (xx9) ww3.K1((List) this.a);
        Float f = xx9Var.j;
        if (f != null) {
            fwiVar.e = f.floatValue();
        }
        if (!((tx9) ((prk) this.b)).m() && Build.VERSION.SDK_INT >= 29 && (num = xx9Var.k) != null) {
            if (num.intValue() < 0) {
                num = null;
            }
            if (num != null) {
                fwiVar.i = num.intValue();
            }
        }
        if (((tx9) ((prk) this.b)).p()) {
            fwiVar.f = -2;
            fwiVar.g = -2;
        }
        tx9 tx9Var = (tx9) ((prk) this.b);
        if (tx9Var instanceof rx9) {
            return new kzi(g(context, fwiVar));
        }
        if (tx9Var instanceof sx9) {
            return g(context, fwiVar);
        }
        ore.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object i(String str, int i, long j, gc2 gc2Var, pb0 pb0Var, nq4 nq4Var) throws Throwable {
        ph2 ph2Var;
        gc2 gc2Var2;
        pb0 pb0Var2;
        long j2;
        int i2;
        String str2;
        if (nq4Var instanceof ph2) {
            ph2Var = (ph2) nq4Var;
            int i3 = ph2Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ph2Var.k = i3 - Integer.MIN_VALUE;
            } else {
                ph2Var = new ph2(this, nq4Var);
            }
        } else {
            ph2Var = new ph2(this, nq4Var);
        }
        Object objK0 = ph2Var.i;
        hu4 hu4Var = hu4.a;
        int i4 = ph2Var.k;
        if (i4 == 0) {
            ch3.d0(objK0);
            kc2 kc2Var = (kc2) this.b;
            ph2Var.d = str;
            ph2Var.e = gc2Var;
            ph2Var.f = pb0Var;
            ph2Var.g = i;
            ph2Var.h = j;
            ph2Var.k = 1;
            synchronized (kc2Var.f) {
                bg2 bg2Var = (bg2) kc2Var.f.get(str);
                objK0 = bg2Var != null ? bg2Var : yab.K0(kc2Var.b.f, new in1(kc2Var, str, null, 9), ph2Var);
            }
            if (objK0 != hu4Var) {
                gc2Var2 = gc2Var;
                pb0Var2 = pb0Var;
                j2 = j;
                i2 = i;
                str2 = str;
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                ch3.d0(objK0);
                return objK0;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j3 = ph2Var.h;
        int i5 = ph2Var.g;
        pb0 pb0Var3 = ph2Var.f;
        gc2 gc2Var3 = ph2Var.e;
        String str3 = ph2Var.d;
        ch3.d0(objK0);
        pb0Var2 = pb0Var3;
        j2 = j3;
        gc2Var2 = gc2Var3;
        str2 = str3;
        i2 = i5;
        jgh jghVar = (jgh) this.e;
        ic2 ic2Var = (ic2) this.c;
        lc2 lc2Var = (lc2) this.d;
        zqh zqhVar = (zqh) this.g;
        gg2 gg2Var = (gg2) this.f;
        h30 h30Var = new h30(this, str2, new lg(str2, (bg2) objK0, i2, j2, jghVar, ic2Var, gc2Var2, lc2Var, zqhVar, pb0Var2, gg2Var.a, gg2Var.b), (lq4) null, 1);
        ph2Var.d = null;
        ph2Var.e = null;
        ph2Var.f = null;
        ph2Var.k = 2;
        mah mahVar = new mah(ph2Var.getContext(), ph2Var);
        Object objX = f55.x(mahVar, true, mahVar, h30Var);
        return objX == hu4Var ? hu4Var : objX;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x013d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public Object j(rt2 rt2Var, int i, List list, nq4 nq4Var) {
        b0c b0cVar;
        MessageModel messageModel;
        List list2;
        rt2 rt2Var2;
        int i2;
        wfe wfeVar;
        final List list3;
        final MessageModel messageModel2;
        final rt2 rt2Var3;
        final rt2 rt2Var4;
        List list4;
        MessageModel messageModel3;
        rt2 rt2Var5;
        List list5;
        String str;
        a4c a4cVar;
        Object objK;
        je9 je9Var = je9.f;
        if (nq4Var instanceof b0c) {
            b0cVar = (b0c) nq4Var;
            int i3 = b0cVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b0cVar.k = i3 - Integer.MIN_VALUE;
            } else {
                b0cVar = new b0c(this, nq4Var);
            }
        } else {
            b0cVar = new b0c(this, nq4Var);
        }
        Object objI = b0cVar.i;
        Object obj = hu4.a;
        int i4 = b0cVar.k;
        if (i4 != 0) {
            if (i4 == 1) {
                i2 = b0cVar.h;
                wfeVar = b0cVar.g;
                messageModel = b0cVar.f;
                list2 = b0cVar.e;
                rt2Var2 = b0cVar.d;
                ch3.d0(objI);
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list6 = b0cVar.e;
                    ch3.d0(objI);
                    return objI;
                }
                i2 = b0cVar.h;
                wfeVar = b0cVar.g;
                messageModel3 = b0cVar.f;
                list5 = b0cVar.e;
                rt2Var5 = b0cVar.d;
                ch3.d0(objI);
            }
            rt2Var4 = (rt2) objI;
            messageModel2 = messageModel3;
            list3 = list5;
            rt2Var3 = rt2Var5;
            final int i5 = i2;
            final wfe wfeVar2 = wfeVar;
            mm9 mm9VarA = new lm9().a(new cf7() { // from class: wzb
                @Override // defpackage.cf7
                public final Object invoke(Object obj2) {
                    lm9 lm9Var = (lm9) obj2;
                    lm9Var.a = rt2Var3;
                    lm9Var.b = rt2Var4;
                    lm9Var.c = i5;
                    lm9Var.e = messageModel2;
                    lm9Var.g = list3;
                    lm9Var.f = (c) wfeVar2.a;
                    return sbi.a;
                }
            });
            b0cVar.d = null;
            b0cVar.e = null;
            b0cVar.f = null;
            b0cVar.g = null;
            b0cVar.h = i5;
            b0cVar.k = 3;
            objK = k(mm9VarA, b0cVar);
            if (objK != obj) {
                return objK;
            }
            list4 = list2;
            return obj;
        }
        ch3.d0(objI);
        messageModel = (MessageModel) ww3.u1(i, list);
        if (messageModel == null) {
            String strK = c0a.k(i, "Trying to update message with index=", " which not exists!");
            gm0.Y((String) this.a, strK);
            ore.c(strK);
            return null;
        }
        if (messageModel.w() || messageModel.p != null) {
            return messageModel;
        }
        wfe wfeVar3 = new wfe();
        b bVar = (b) ((ny8) this.d).getValue();
        long j = messageModel.a;
        if (j == 0) {
            bVar.getClass();
            gm0.V("PreProcessDataCache", "zero message in PreProcessDataCache", new MessageException.ZeroId());
        }
        c cVar = (c) (rt2Var instanceof s04 ? bVar.h : bVar.g).get(Long.valueOf(j));
        wfeVar3.a = cVar;
        if (cVar == null) {
            String str2 = (String) this.a;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                long j2 = messageModel.a;
                long j3 = rt2Var.a;
                StringBuilder sbS = qt4.s(j2, "Trying to update message with non-existed preProcessedData! MsgId:", ",chatId:");
                sbS.append(j3);
                a4cVar2.c(je9Var, str2, sbS.toString(), null);
            }
            j44 j44Var = (j44) ((ny8) this.f).getValue();
            long j4 = messageModel.a;
            b0cVar.d = rt2Var;
            b0cVar.e = list;
            b0cVar.f = messageModel;
            b0cVar.g = wfeVar3;
            b0cVar.h = i;
            b0cVar.k = 1;
            Object objF = j44Var.f(j4, b0cVar);
            if (objF != obj) {
                list2 = list;
                rt2Var2 = rt2Var;
                i2 = i;
                wfeVar = wfeVar3;
                objI = objF;
            }
        } else {
            list2 = list;
            rt2Var2 = rt2Var;
            i2 = i;
            wfeVar = wfeVar3;
            if (messageModel.a != ((c) wfeVar.a).d.a) {
                str = (String) this.a;
                a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    long j5 = messageModel.a;
                    long j6 = ((c) wfeVar.a).d.a;
                    StringBuilder sbS2 = qt4.s(j5, "WARNING! Wrong message id in preProcessedData when try update model, \n                    |msgId:", ", \n                    |fromData msgId:");
                    sbS2.append(j6);
                    sbS2.append("\n                    |");
                    a4cVar.c(je9Var, str, s5h.y0(sbS2.toString()), null);
                }
            }
            if (rt2Var2 instanceof s04) {
                xn3 xn3Var = (xn3) ((ny8) this.g).getValue();
                long j7 = ((s04) rt2Var2).r.a;
                b0cVar.d = rt2Var2;
                b0cVar.e = list4;
                b0cVar.f = messageModel;
                b0cVar.g = wfeVar;
                b0cVar.h = i2;
                b0cVar.k = 2;
                objI = xn3Var.i(j7, b0cVar);
                if (objI != obj) {
                    list4 = list2;
                    messageModel3 = messageModel;
                    rt2Var5 = rt2Var2;
                    list5 = list2;
                    rt2Var4 = (rt2) objI;
                    messageModel2 = messageModel3;
                    list3 = list5;
                    rt2Var3 = rt2Var5;
                    final int i6 = i2;
                    final wfe wfeVar4 = wfeVar;
                    mm9 mm9VarA2 = new lm9().a(new cf7() { // from class: wzb
                        @Override // defpackage.cf7
                        public final Object invoke(Object obj2) {
                            lm9 lm9Var = (lm9) obj2;
                            lm9Var.a = rt2Var3;
                            lm9Var.b = rt2Var4;
                            lm9Var.c = i6;
                            lm9Var.e = messageModel2;
                            lm9Var.g = list3;
                            lm9Var.f = (c) wfeVar4.a;
                            return sbi.a;
                        }
                    });
                    b0cVar.d = null;
                    b0cVar.e = null;
                    b0cVar.f = null;
                    b0cVar.g = null;
                    b0cVar.h = i6;
                    b0cVar.k = 3;
                    objK = k(mm9VarA2, b0cVar);
                    if (objK != obj) {
                        return objK;
                    }
                }
            } else {
                list3 = list2;
                messageModel2 = messageModel;
                rt2Var3 = rt2Var2;
                rt2Var4 = null;
                final int i7 = i2;
                final wfe wfeVar5 = wfeVar;
                mm9 mm9VarA3 = new lm9().a(new cf7() { // from class: wzb
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj2) {
                        lm9 lm9Var = (lm9) obj2;
                        lm9Var.a = rt2Var3;
                        lm9Var.b = rt2Var4;
                        lm9Var.c = i7;
                        lm9Var.e = messageModel2;
                        lm9Var.g = list3;
                        lm9Var.f = (c) wfeVar5.a;
                        return sbi.a;
                    }
                });
                b0cVar.d = null;
                b0cVar.e = null;
                b0cVar.f = null;
                b0cVar.g = null;
                b0cVar.h = i7;
                b0cVar.k = 3;
                objK = k(mm9VarA3, b0cVar);
                if (objK != obj) {
                    return objK;
                }
            }
        }
        list4 = list2;
        return obj;
        sfa sfaVar = (sfa) objI;
        if (sfaVar == null) {
            gm0.Y((String) this.a, "Trying to update message with non-existed preProcessedData and message not exist in database!");
            return null;
        }
        wfeVar.a = ((b) ((ny8) this.d).getValue()).f(rt2Var2, sfaVar);
        if (messageModel.a != ((c) wfeVar.a).d.a) {
            str = (String) this.a;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                long j8 = messageModel.a;
                long j9 = ((c) wfeVar.a).d.a;
                StringBuilder sbS3 = qt4.s(j8, "WARNING! Wrong message id in preProcessedData when try update model, \n                    |msgId:", ", \n                    |fromData msgId:");
                sbS3.append(j9);
                sbS3.append("\n                    |");
                a4cVar.c(je9Var, str, s5h.y0(sbS3.toString()), null);
            }
        }
        if (rt2Var2 instanceof s04) {
            xn3 xn3Var2 = (xn3) ((ny8) this.g).getValue();
            long j10 = ((s04) rt2Var2).r.a;
            b0cVar.d = rt2Var2;
            b0cVar.e = list4;
            b0cVar.f = messageModel;
            b0cVar.g = wfeVar;
            b0cVar.h = i2;
            b0cVar.k = 2;
            objI = xn3Var2.i(j10, b0cVar);
            if (objI != obj) {
                list4 = list2;
                messageModel3 = messageModel;
                rt2Var5 = rt2Var2;
                list5 = list2;
                rt2Var4 = (rt2) objI;
                messageModel2 = messageModel3;
                list3 = list5;
                rt2Var3 = rt2Var5;
                final int i8 = i2;
                final wfe wfeVar6 = wfeVar;
                mm9 mm9VarA4 = new lm9().a(new cf7() { // from class: wzb
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj2) {
                        lm9 lm9Var = (lm9) obj2;
                        lm9Var.a = rt2Var3;
                        lm9Var.b = rt2Var4;
                        lm9Var.c = i8;
                        lm9Var.e = messageModel2;
                        lm9Var.g = list3;
                        lm9Var.f = (c) wfeVar6.a;
                        return sbi.a;
                    }
                });
                b0cVar.d = null;
                b0cVar.e = null;
                b0cVar.f = null;
                b0cVar.g = null;
                b0cVar.h = i8;
                b0cVar.k = 3;
                objK = k(mm9VarA4, b0cVar);
                if (objK != obj) {
                    return objK;
                }
            }
        } else {
            list3 = list2;
            messageModel2 = messageModel;
            rt2Var3 = rt2Var2;
            rt2Var4 = null;
            final int i9 = i2;
            final wfe wfeVar7 = wfeVar;
            mm9 mm9VarA5 = new lm9().a(new cf7() { // from class: wzb
                @Override // defpackage.cf7
                public final Object invoke(Object obj2) {
                    lm9 lm9Var = (lm9) obj2;
                    lm9Var.a = rt2Var3;
                    lm9Var.b = rt2Var4;
                    lm9Var.c = i9;
                    lm9Var.e = messageModel2;
                    lm9Var.g = list3;
                    lm9Var.f = (c) wfeVar7.a;
                    return sbi.a;
                }
            });
            b0cVar.d = null;
            b0cVar.e = null;
            b0cVar.f = null;
            b0cVar.g = null;
            b0cVar.h = i9;
            b0cVar.k = 3;
            objK = k(mm9VarA5, b0cVar);
            if (objK != obj) {
                return objK;
            }
        }
        list4 = list2;
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:108:0x0200  */
    /* JADX WARN: Code duplicated, block: B:110:0x0204  */
    /* JADX WARN: Code duplicated, block: B:114:0x0210  */
    /* JADX WARN: Code duplicated, block: B:115:0x0215  */
    /* JADX WARN: Code duplicated, block: B:117:0x0219  */
    /* JADX WARN: Code duplicated, block: B:118:0x021e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0222  */
    /* JADX WARN: Code duplicated, block: B:121:0x0227  */
    /* JADX WARN: Code duplicated, block: B:123:0x022b  */
    /* JADX WARN: Code duplicated, block: B:124:0x022f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0233  */
    /* JADX WARN: Code duplicated, block: B:127:0x0238  */
    /* JADX WARN: Code duplicated, block: B:129:0x023c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0241  */
    /* JADX WARN: Code duplicated, block: B:132:0x0245  */
    /* JADX WARN: Code duplicated, block: B:135:0x0252  */
    /* JADX WARN: Code duplicated, block: B:138:0x0271  */
    /* JADX WARN: Code duplicated, block: B:175:0x0357  */
    /* JADX WARN: Code duplicated, block: B:178:0x035c  */
    /* JADX WARN: Code duplicated, block: B:181:0x0370  */
    /* JADX WARN: Code duplicated, block: B:182:0x0372  */
    /* JADX WARN: Code duplicated, block: B:185:0x037b  */
    /* JADX WARN: Code duplicated, block: B:186:0x037d  */
    /* JADX WARN: Code duplicated, block: B:189:0x0392 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:197:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:201:0x03c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:223:0x043e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0442  */
    /* JADX WARN: Code duplicated, block: B:226:0x0457  */
    /* JADX WARN: Code duplicated, block: B:230:0x047c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:52:0x011f  */
    /* JADX WARN: Code duplicated, block: B:56:0x012f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x0131  */
    /* JADX WARN: Code duplicated, block: B:58:0x0135  */
    /* JADX WARN: Code duplicated, block: B:60:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0141  */
    /* JADX WARN: Code duplicated, block: B:64:0x0145  */
    /* JADX WARN: Code duplicated, block: B:66:0x0151  */
    /* JADX WARN: Code duplicated, block: B:68:0x015b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0166  */
    /* JADX WARN: Code duplicated, block: B:72:0x0168  */
    /* JADX WARN: Code duplicated, block: B:74:0x016b  */
    /* JADX WARN: Code duplicated, block: B:79:0x018d  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:88:0x01af  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:97:0x01dc  */
    public Object k(mm9 mm9Var, nq4 nq4Var) {
        c0c c0cVar;
        long j;
        int i;
        mm9 mm9Var2;
        vg4 vg4Var;
        MessageModel messageModelC;
        rt2 rt2Var;
        t50 t50Var;
        CharSequence charSequenceD;
        int i2;
        int i3;
        int i4;
        long j2;
        int i5;
        tlg tlgVar;
        String str;
        String str2;
        int i6;
        u40 u40Var;
        int i7;
        long j3;
        int i8;
        MessageModel messageModel;
        MessageModel messageModel2;
        MessageModel messageModel3;
        int i9;
        String strA;
        Object qiaVar;
        rt2 rt2Var2;
        boolean z;
        int iB;
        boolean z2;
        Long lValueOf;
        int i10;
        int i11;
        Layout layoutB;
        int iB2;
        MessageModel messageModel4;
        MessageModel messageModel5;
        mm9 mm9Var3 = mm9Var;
        if (nq4Var instanceof c0c) {
            c0cVar = (c0c) nq4Var;
            int i12 = c0cVar.m;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c0cVar.m = i12 - Integer.MIN_VALUE;
            } else {
                c0cVar = new c0c(this, nq4Var);
            }
        } else {
            c0cVar = new c0c(this, nq4Var);
        }
        c0c c0cVar2 = c0cVar;
        Object objA = c0cVar2.k;
        Object obj = hu4.a;
        int i13 = c0cVar2.m;
        if (i13 == 0) {
            j = 0;
            ch3.d0(objA);
            c0cVar2.d = mm9Var3;
            c0cVar2.m = 1;
            objA = a(mm9Var3, c0cVar2);
            if (objA != obj) {
            }
            return obj;
        }
        if (i13 == 1) {
            j = 0;
            mm9Var3 = c0cVar2.d;
            ch3.d0(objA);
        } else {
            if (i13 == 2) {
                j = 0;
                int i14 = c0cVar2.i;
                mm9 mm9Var4 = c0cVar2.d;
                ch3.d0(objA);
                mm9Var2 = mm9Var4;
                i = i14;
                vg4Var = (vg4) objA;
                messageModelC = mm9Var2.c();
                MessageModel messageModelC2 = mm9Var2.c();
                rt2Var = mm9Var2.a;
                t50Var = messageModelC2.j.b;
                if (!mm9Var2.c().l) {
                    if (!mm9Var2.c().w()) {
                        if (mm9Var2.c().p != null) {
                            i6 = -2147483646;
                        } else {
                            charSequenceD = mm9Var2.c.d(rt2Var);
                            if (charSequenceD != null || charSequenceD.length() == 0) {
                                i2 = 4;
                                i3 = 2;
                                i4 = 1;
                            } else {
                                u40 u40Var2 = mm9Var2.c().j;
                                i2 = 4;
                                i3 = 2;
                                if (u40Var2.b == null) {
                                    i4 = 1;
                                    long j4 = u40Var2.a;
                                    int i15 = v40.b;
                                    if ((j4 & 1) == j) {
                                        i8 = 0;
                                    }
                                    if (i8 == 0) {
                                        i5 = -2147483645;
                                    }
                                    i6 = i5 | i;
                                } else {
                                    i4 = 1;
                                }
                                i8 = i4;
                                if (i8 == 0) {
                                    i5 = -2147483645;
                                }
                                i6 = i5 | i;
                            }
                            rt2Var.getClass();
                            if ((rt2Var instanceof s04) || t50Var == null) {
                                if (t50Var instanceof yb1) {
                                    i5 = -2147483647;
                                } else if (t50Var instanceof zj7) {
                                    i5 = -2147483636;
                                } else {
                                    if (mm9Var2.c().d.length() > 0) {
                                        u40Var = mm9Var2.c().j;
                                        if (u40Var.b == null) {
                                            j3 = u40Var.a;
                                            int i16 = v40.b;
                                            if ((j3 & 1) != j) {
                                                i7 = i4;
                                            } else {
                                                i7 = 0;
                                            }
                                        } else {
                                            i7 = i4;
                                        }
                                        if (i7 != 0 || (mm9Var2.c().j.b instanceof n1h)) {
                                            i6 = i4 | i;
                                        }
                                    }
                                    j2 = mm9Var2.c().j.a;
                                    int i17 = v40.b;
                                    if ((j2 & 2) == j && (t50Var instanceof h8g)) {
                                        i6 = i3 | i;
                                        if (mm9Var2.c().d.length() > 0 && mm9Var2.c().m != null) {
                                            i6 = i | 3;
                                        }
                                    } else if (t50Var instanceof eag) {
                                        i6 = i2 | i;
                                        if (mm9Var2.c().d.length() > 0 && mm9Var2.c().m != null) {
                                            i6 = i | 5;
                                        }
                                    } else if (t50Var instanceof yv3) {
                                        i6 = 16 | i;
                                        if (mm9Var2.c().d.length() > 0 && mm9Var2.c().m != null) {
                                            i6 = i | 17;
                                        }
                                    } else if (t50Var instanceof plg) {
                                        tlgVar = ((plg) t50Var).a;
                                        str = tlgVar.f;
                                        if (str != null || str.length() == 0) {
                                            str2 = tlgVar.e;
                                            if (str2 != null || str2.length() == 0) {
                                                i5 = -2147483641;
                                            } else {
                                                i5 = -2147483644;
                                            }
                                        } else {
                                            i5 = -2147483643;
                                        }
                                    } else if (t50Var instanceof jh4) {
                                        i5 = -2147483638;
                                    } else if (t50Var instanceof mxf) {
                                        i5 = -2147483637;
                                    } else if (t50Var instanceof y90) {
                                        i5 = 8;
                                    } else if (t50Var instanceof aq6) {
                                        i5 = -2147483639;
                                    } else if (t50Var instanceof oxi) {
                                        i5 = -2147483642;
                                    } else if (t50Var instanceof e7d) {
                                        i5 = -2147483633;
                                    } else {
                                        i6 = (-2147483634) | i;
                                    }
                                }
                                i6 = i5 | i;
                            } else {
                                i6 = (-2147483634) | i;
                            }
                        }
                        messageModelC.F = i6;
                        c0cVar2.d = mm9Var2;
                        c0cVar2.e = vg4Var;
                        c0cVar2.f = messageModelC;
                        c0cVar2.g = messageModelC;
                        c0cVar2.h = messageModelC;
                        c0cVar2.i = i;
                        c0cVar2.j = 0;
                        c0cVar2.m = 3;
                        objA = qia.d;
                        if (!mm9Var2.a.h0() || ((mm9Var2.a.d0() && !mm9Var2.c().r()) || (67108864 & i) == 0)) {
                            objA = null;
                        } else if ((268435456 & i) != 0 || (134217728 & i) != 0) {
                            boolean zR = mm9Var2.c().r();
                            rt2 rt2Var3 = mm9Var2.a;
                            if (zR) {
                                long jQ = rt2Var3.q();
                                rt2 rt2Var4 = mm9Var2.a;
                                rt2Var4.L0();
                                qiaVar = new qia(jQ, rt2Var4.m, mm9Var2.a.r(gm0.K(56.0f * yl5.d().getDisplayMetrics().density)));
                            } else {
                                rt2Var3.getClass();
                                if ((rt2Var3 instanceof s04) && mm9Var2.c().y && (rt2Var2 = mm9Var2.b) != null) {
                                    long jQ2 = rt2Var2.q();
                                    rt2Var2.L0();
                                    qiaVar = new qia(jQ2, rt2Var2.m, rt2Var2.r(gm0.K(56.0f * yl5.d().getDisplayMetrics().density)));
                                } else if (cqk.d(mm9Var2.c().D, objA)) {
                                    if (jcd.d((jcd) ((ny8) this.h).getValue(), vg4Var, null, i3)) {
                                        strA = ((jcd) ((ny8) this.h).getValue()).a().toString();
                                    } else {
                                        strA = vg4Var != null ? kh4.a(vg4Var, us0.b) : null;
                                    }
                                    qiaVar = new qia(mm9Var2.c().x, vg4Var != null ? vg4Var.u() : null, strA);
                                } else {
                                    objA = mm9Var2.c().D;
                                }
                            }
                            objA = qiaVar;
                        }
                        if (objA != obj) {
                            messageModel = messageModelC;
                            messageModel2 = messageModel;
                            messageModel3 = messageModel2;
                            i9 = 0;
                            messageModel.D = (qia) objA;
                            int iC = sfl.c(0, z21.b(i));
                            if (messageModel2.D != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            iB = sfl.b(iC, z);
                            if ((iB & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            boolean zD0 = mm9Var2.a.d0();
                            boolean z3 = mm9Var2.c().y;
                            long j5 = mm9Var2.c().x;
                            if (z2) {
                                lValueOf = null;
                            } else {
                                lValueOf = null;
                            }
                            messageModel2.E = lValueOf;
                            i10 = messageModel2.G;
                            int i18 = messageModel2.F;
                            MessageModel messageModelC3 = mm9Var2.c();
                            c cVar = mm9Var2.c;
                            long j6 = messageModelC3.x;
                            rt2 rt2Var5 = mm9Var2.a;
                            mm9 mm9Var5 = mm9Var2;
                            String strK = rt2Var5.k(j6);
                            if (i10 != 1) {
                                i11 = 0;
                                layoutB = null;
                            } else {
                                i11 = 0;
                                layoutB = null;
                            }
                            if (layoutB != null) {
                                iB2 = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, layoutB.getWidth());
                            } else {
                                iB2 = i11;
                            }
                            messageModel2.C = layoutB;
                            int i19 = messageModel2.F;
                            c0cVar2.d = null;
                            c0cVar2.e = null;
                            c0cVar2.f = messageModel3;
                            c0cVar2.g = null;
                            c0cVar2.h = messageModel2;
                            c0cVar2.i = i;
                            c0cVar2.j = i9;
                            c0cVar2.m = i2;
                            objA = b(mm9Var5, i, i19, iB2, iB, c0cVar2);
                            if (objA != obj) {
                                messageModel4 = messageModel2;
                                messageModel5 = messageModel3;
                            }
                        }
                        return obj;
                    }
                    i2 = 4;
                    i3 = 2;
                    i6 = 0;
                    if (mm9Var2.c().n != null) {
                        i6 |= 16777216;
                    }
                    messageModelC.F = i6;
                    c0cVar2.d = mm9Var2;
                    c0cVar2.e = vg4Var;
                    c0cVar2.f = messageModelC;
                    c0cVar2.g = messageModelC;
                    c0cVar2.h = messageModelC;
                    c0cVar2.i = i;
                    c0cVar2.j = 0;
                    c0cVar2.m = 3;
                    objA = qia.d;
                    if (mm9Var2.a.h0()) {
                        objA = null;
                    } else {
                        objA = null;
                    }
                    if (objA != obj) {
                        messageModel = messageModelC;
                        messageModel2 = messageModel;
                        messageModel3 = messageModel2;
                        i9 = 0;
                        messageModel.D = (qia) objA;
                        int iC2 = sfl.c(0, z21.b(i));
                        if (messageModel2.D != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        iB = sfl.b(iC2, z);
                        if ((iB & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        boolean zD1 = mm9Var2.a.d0();
                        boolean z4 = mm9Var2.c().y;
                        long j7 = mm9Var2.c().x;
                        if (z2) {
                            lValueOf = null;
                        } else {
                            lValueOf = null;
                        }
                        messageModel2.E = lValueOf;
                        i10 = messageModel2.G;
                        int i110 = messageModel2.F;
                        MessageModel messageModelC4 = mm9Var2.c();
                        c cVar2 = mm9Var2.c;
                        long j8 = messageModelC4.x;
                        rt2 rt2Var6 = mm9Var2.a;
                        mm9 mm9Var6 = mm9Var2;
                        String strK2 = rt2Var6.k(j8);
                        if (i10 != 1) {
                            i11 = 0;
                            layoutB = null;
                        } else {
                            i11 = 0;
                            layoutB = null;
                        }
                        if (layoutB != null) {
                            iB2 = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, layoutB.getWidth());
                        } else {
                            iB2 = i11;
                        }
                        messageModel2.C = layoutB;
                        int i111 = messageModel2.F;
                        c0cVar2.d = null;
                        c0cVar2.e = null;
                        c0cVar2.f = messageModel3;
                        c0cVar2.g = null;
                        c0cVar2.h = messageModel2;
                        c0cVar2.i = i;
                        c0cVar2.j = i9;
                        c0cVar2.m = i2;
                        objA = b(mm9Var6, i, i111, iB2, iB, c0cVar2);
                        if (objA != obj) {
                            messageModel4 = messageModel2;
                            messageModel5 = messageModel3;
                        }
                    }
                    return obj;
                }
                i6 = (-2147483635) | i;
                i2 = 4;
                i3 = 2;
                if (mm9Var2.c().n != null) {
                    i6 |= 16777216;
                }
                messageModelC.F = i6;
                c0cVar2.d = mm9Var2;
                c0cVar2.e = vg4Var;
                c0cVar2.f = messageModelC;
                c0cVar2.g = messageModelC;
                c0cVar2.h = messageModelC;
                c0cVar2.i = i;
                c0cVar2.j = 0;
                c0cVar2.m = 3;
                objA = qia.d;
                if (mm9Var2.a.h0()) {
                    objA = null;
                } else {
                    objA = null;
                }
                if (objA != obj) {
                    messageModel = messageModelC;
                    messageModel2 = messageModel;
                    messageModel3 = messageModel2;
                    i9 = 0;
                    messageModel.D = (qia) objA;
                    int iC3 = sfl.c(0, z21.b(i));
                    if (messageModel2.D != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    iB = sfl.b(iC3, z);
                    if ((iB & 2) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean zD2 = mm9Var2.a.d0();
                    boolean z5 = mm9Var2.c().y;
                    long j9 = mm9Var2.c().x;
                    if (z2) {
                        lValueOf = null;
                    } else {
                        lValueOf = null;
                    }
                    messageModel2.E = lValueOf;
                    i10 = messageModel2.G;
                    int i112 = messageModel2.F;
                    MessageModel messageModelC5 = mm9Var2.c();
                    c cVar3 = mm9Var2.c;
                    long j10 = messageModelC5.x;
                    rt2 rt2Var7 = mm9Var2.a;
                    mm9 mm9Var7 = mm9Var2;
                    String strK3 = rt2Var7.k(j10);
                    if (i10 != 1) {
                        i11 = 0;
                        layoutB = null;
                    } else {
                        i11 = 0;
                        layoutB = null;
                    }
                    if (layoutB != null) {
                        iB2 = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, layoutB.getWidth());
                    } else {
                        iB2 = i11;
                    }
                    messageModel2.C = layoutB;
                    int i113 = messageModel2.F;
                    c0cVar2.d = null;
                    c0cVar2.e = null;
                    c0cVar2.f = messageModel3;
                    c0cVar2.g = null;
                    c0cVar2.h = messageModel2;
                    c0cVar2.i = i;
                    c0cVar2.j = i9;
                    c0cVar2.m = i2;
                    objA = b(mm9Var7, i, i113, iB2, iB, c0cVar2);
                    if (objA != obj) {
                        messageModel4 = messageModel2;
                        messageModel5 = messageModel3;
                    }
                }
                return obj;
            }
            if (i13 == 3) {
                i9 = c0cVar2.j;
                i = c0cVar2.i;
                messageModel = c0cVar2.h;
                messageModel2 = c0cVar2.g;
                messageModel3 = c0cVar2.f;
                j = 0;
                vg4Var = c0cVar2.e;
                mm9Var2 = c0cVar2.d;
                ch3.d0(objA);
                i2 = 4;
                messageModel.D = (qia) objA;
                int iC4 = sfl.c(0, z21.b(i));
                if (messageModel2.D != null) {
                    z = true;
                } else {
                    z = false;
                }
                iB = sfl.b(iC4, z);
                if ((iB & 2) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean zD3 = mm9Var2.a.d0();
                boolean z6 = mm9Var2.c().y;
                long j11 = mm9Var2.c().x;
                if (z2 || zD3 || z6 || (vg4Var != null && (!vg4Var.B() || vg4Var.I()))) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(j11);
                }
                messageModel2.E = lValueOf;
                i10 = messageModel2.G;
                int i114 = messageModel2.F;
                MessageModel messageModelC6 = mm9Var2.c();
                c cVar4 = mm9Var2.c;
                long j12 = messageModelC6.x;
                rt2 rt2Var8 = mm9Var2.a;
                mm9 mm9Var8 = mm9Var2;
                String strK4 = rt2Var8.k(j12);
                if (i10 != 1 || i10 == 3 || !mm9Var8.c().z || j12 == j || !z21.a(i) || vka.f(i114)) {
                    i11 = 0;
                    layoutB = null;
                } else if (strK4 != null && !r5h.X0(strK4)) {
                    i11 = 0;
                    layoutB = ihf.b((ihf) ((ifh) this.c).getValue(), strK4, iB, false, 28);
                } else if (rt2Var8.v0(j12)) {
                    i11 = 0;
                    layoutB = ihf.b((ihf) ((ifh) this.c).getValue(), cVar4.a.a.getString(ru.oneme.app.R.string.profile_members_list_owner_alias), iB, false, 28);
                } else if (rt2Var8.Y(j12)) {
                    i11 = 0;
                    layoutB = ihf.b((ihf) ((ifh) this.c).getValue(), cVar4.a.a.getString(ru.oneme.app.R.string.profile_members_list_admin_alias), iB, false, 28);
                } else {
                    i11 = 0;
                    layoutB = null;
                }
                if (layoutB != null) {
                    iB2 = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, layoutB.getWidth());
                } else {
                    iB2 = i11;
                }
                messageModel2.C = layoutB;
                int i115 = messageModel2.F;
                c0cVar2.d = null;
                c0cVar2.e = null;
                c0cVar2.f = messageModel3;
                c0cVar2.g = null;
                c0cVar2.h = messageModel2;
                c0cVar2.i = i;
                c0cVar2.j = i9;
                c0cVar2.m = i2;
                objA = b(mm9Var8, i, i115, iB2, iB, c0cVar2);
                if (objA != obj) {
                    messageModel4 = messageModel2;
                    messageModel5 = messageModel3;
                }
                return obj;
            }
            if (i13 != 4) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            messageModel4 = c0cVar2.h;
            messageModel5 = c0cVar2.f;
            ch3.d0(objA);
        }
        messageModel4.B = (Layout) objA;
        return messageModel5;
        int i20 = ((z21) objA).a;
        no4 no4Var = (no4) ((ny8) this.e).getValue();
        long j13 = mm9Var3.c().x;
        c0cVar2.d = mm9Var3;
        c0cVar2.i = i20;
        c0cVar2.m = 2;
        Object objI = no4Var.i(j13);
        if (objI != obj) {
            i = i20;
            objA = objI;
            mm9Var2 = mm9Var3;
            vg4Var = (vg4) objA;
            messageModelC = mm9Var2.c();
            MessageModel messageModelC7 = mm9Var2.c();
            rt2Var = mm9Var2.a;
            t50Var = messageModelC7.j.b;
            if (!mm9Var2.c().l) {
                i6 = (-2147483635) | i;
            } else {
                if (!mm9Var2.c().w()) {
                    i2 = 4;
                    i3 = 2;
                    i6 = 0;
                } else {
                    if (mm9Var2.c().p != null) {
                        i6 = -2147483646;
                    } else {
                        charSequenceD = mm9Var2.c.d(rt2Var);
                        if (charSequenceD != null) {
                            i2 = 4;
                            i3 = 2;
                            i4 = 1;
                            rt2Var.getClass();
                            if (rt2Var instanceof s04) {
                                if (t50Var instanceof yb1) {
                                    i5 = -2147483647;
                                } else if (t50Var instanceof zj7) {
                                    i5 = -2147483636;
                                } else {
                                    if (mm9Var2.c().d.length() > 0) {
                                        u40Var = mm9Var2.c().j;
                                        if (u40Var.b == null) {
                                            j3 = u40Var.a;
                                            int i116 = v40.b;
                                            if ((j3 & 1) != j) {
                                                i7 = i4;
                                            } else {
                                                i7 = 0;
                                            }
                                        } else {
                                            i7 = i4;
                                        }
                                        if (i7 != 0) {
                                        }
                                        i6 = i4 | i;
                                    }
                                    j2 = mm9Var2.c().j.a;
                                    int i117 = v40.b;
                                    if ((j2 & 2) == j) {
                                        if (t50Var instanceof eag) {
                                            i6 = i2 | i;
                                            if (mm9Var2.c().d.length() > 0) {
                                                i6 = i | 5;
                                            }
                                        } else if (t50Var instanceof yv3) {
                                            i6 = 16 | i;
                                            if (mm9Var2.c().d.length() > 0) {
                                                i6 = i | 17;
                                            }
                                        } else if (t50Var instanceof plg) {
                                            tlgVar = ((plg) t50Var).a;
                                            str = tlgVar.f;
                                            if (str != null) {
                                                str2 = tlgVar.e;
                                                if (str2 != null) {
                                                    i5 = -2147483641;
                                                } else {
                                                    i5 = -2147483641;
                                                }
                                            } else {
                                                str2 = tlgVar.e;
                                                if (str2 != null) {
                                                    i5 = -2147483641;
                                                } else {
                                                    i5 = -2147483641;
                                                }
                                            }
                                        } else if (t50Var instanceof jh4) {
                                            i5 = -2147483638;
                                        } else if (t50Var instanceof mxf) {
                                            i5 = -2147483637;
                                        } else if (t50Var instanceof y90) {
                                            i5 = 8;
                                        } else if (t50Var instanceof aq6) {
                                            i5 = -2147483639;
                                        } else if (t50Var instanceof oxi) {
                                            i5 = -2147483642;
                                        } else if (t50Var instanceof e7d) {
                                            i5 = -2147483633;
                                        } else {
                                            i6 = (-2147483634) | i;
                                        }
                                    } else if (t50Var instanceof eag) {
                                        i6 = i2 | i;
                                        if (mm9Var2.c().d.length() > 0) {
                                            i6 = i | 5;
                                        }
                                    } else if (t50Var instanceof yv3) {
                                        i6 = 16 | i;
                                        if (mm9Var2.c().d.length() > 0) {
                                            i6 = i | 17;
                                        }
                                    } else if (t50Var instanceof plg) {
                                        tlgVar = ((plg) t50Var).a;
                                        str = tlgVar.f;
                                        if (str != null) {
                                            str2 = tlgVar.e;
                                            if (str2 != null) {
                                                i5 = -2147483641;
                                            } else {
                                                i5 = -2147483641;
                                            }
                                        } else {
                                            str2 = tlgVar.e;
                                            if (str2 != null) {
                                                i5 = -2147483641;
                                            } else {
                                                i5 = -2147483641;
                                            }
                                        }
                                    } else if (t50Var instanceof jh4) {
                                        i5 = -2147483638;
                                    } else if (t50Var instanceof mxf) {
                                        i5 = -2147483637;
                                    } else if (t50Var instanceof y90) {
                                        i5 = 8;
                                    } else if (t50Var instanceof aq6) {
                                        i5 = -2147483639;
                                    } else if (t50Var instanceof oxi) {
                                        i5 = -2147483642;
                                    } else if (t50Var instanceof e7d) {
                                        i5 = -2147483633;
                                    } else {
                                        i6 = (-2147483634) | i;
                                    }
                                }
                            } else if (t50Var instanceof yb1) {
                                i5 = -2147483647;
                            } else if (t50Var instanceof zj7) {
                                i5 = -2147483636;
                            } else {
                                if (mm9Var2.c().d.length() > 0) {
                                    u40Var = mm9Var2.c().j;
                                    if (u40Var.b == null) {
                                        j3 = u40Var.a;
                                        int i118 = v40.b;
                                        if ((j3 & 1) != j) {
                                            i7 = i4;
                                        } else {
                                            i7 = 0;
                                        }
                                    } else {
                                        i7 = i4;
                                    }
                                    if (i7 != 0) {
                                    }
                                    i6 = i4 | i;
                                }
                                j2 = mm9Var2.c().j.a;
                                int i119 = v40.b;
                                if ((j2 & 2) == j) {
                                    if (t50Var instanceof eag) {
                                        i6 = i2 | i;
                                        if (mm9Var2.c().d.length() > 0) {
                                            i6 = i | 5;
                                        }
                                    } else if (t50Var instanceof yv3) {
                                        i6 = 16 | i;
                                        if (mm9Var2.c().d.length() > 0) {
                                            i6 = i | 17;
                                        }
                                    } else if (t50Var instanceof plg) {
                                        tlgVar = ((plg) t50Var).a;
                                        str = tlgVar.f;
                                        if (str != null) {
                                            str2 = tlgVar.e;
                                            if (str2 != null) {
                                                i5 = -2147483641;
                                            } else {
                                                i5 = -2147483641;
                                            }
                                        } else {
                                            str2 = tlgVar.e;
                                            if (str2 != null) {
                                                i5 = -2147483641;
                                            } else {
                                                i5 = -2147483641;
                                            }
                                        }
                                    } else if (t50Var instanceof jh4) {
                                        i5 = -2147483638;
                                    } else if (t50Var instanceof mxf) {
                                        i5 = -2147483637;
                                    } else if (t50Var instanceof y90) {
                                        i5 = 8;
                                    } else if (t50Var instanceof aq6) {
                                        i5 = -2147483639;
                                    } else if (t50Var instanceof oxi) {
                                        i5 = -2147483642;
                                    } else if (t50Var instanceof e7d) {
                                        i5 = -2147483633;
                                    } else {
                                        i6 = (-2147483634) | i;
                                    }
                                } else if (t50Var instanceof eag) {
                                    i6 = i2 | i;
                                    if (mm9Var2.c().d.length() > 0) {
                                        i6 = i | 5;
                                    }
                                } else if (t50Var instanceof yv3) {
                                    i6 = 16 | i;
                                    if (mm9Var2.c().d.length() > 0) {
                                        i6 = i | 17;
                                    }
                                } else if (t50Var instanceof plg) {
                                    tlgVar = ((plg) t50Var).a;
                                    str = tlgVar.f;
                                    if (str != null) {
                                        str2 = tlgVar.e;
                                        if (str2 != null) {
                                            i5 = -2147483641;
                                        } else {
                                            i5 = -2147483641;
                                        }
                                    } else {
                                        str2 = tlgVar.e;
                                        if (str2 != null) {
                                            i5 = -2147483641;
                                        } else {
                                            i5 = -2147483641;
                                        }
                                    }
                                } else if (t50Var instanceof jh4) {
                                    i5 = -2147483638;
                                } else if (t50Var instanceof mxf) {
                                    i5 = -2147483637;
                                } else if (t50Var instanceof y90) {
                                    i5 = 8;
                                } else if (t50Var instanceof aq6) {
                                    i5 = -2147483639;
                                } else if (t50Var instanceof oxi) {
                                    i5 = -2147483642;
                                } else if (t50Var instanceof e7d) {
                                    i5 = -2147483633;
                                } else {
                                    i6 = (-2147483634) | i;
                                }
                            }
                        } else {
                            i2 = 4;
                            i3 = 2;
                            i4 = 1;
                            rt2Var.getClass();
                            if (rt2Var instanceof s04) {
                                if (t50Var instanceof yb1) {
                                    i5 = -2147483647;
                                } else if (t50Var instanceof zj7) {
                                    i5 = -2147483636;
                                } else {
                                    if (mm9Var2.c().d.length() > 0) {
                                        u40Var = mm9Var2.c().j;
                                        if (u40Var.b == null) {
                                            j3 = u40Var.a;
                                            int i1110 = v40.b;
                                            if ((j3 & 1) != j) {
                                                i7 = i4;
                                            } else {
                                                i7 = 0;
                                            }
                                        } else {
                                            i7 = i4;
                                        }
                                        if (i7 != 0) {
                                        }
                                        i6 = i4 | i;
                                    }
                                    j2 = mm9Var2.c().j.a;
                                    int i1111 = v40.b;
                                    if ((j2 & 2) == j) {
                                        if (t50Var instanceof eag) {
                                            i6 = i2 | i;
                                            if (mm9Var2.c().d.length() > 0) {
                                                i6 = i | 5;
                                            }
                                        } else if (t50Var instanceof yv3) {
                                            i6 = 16 | i;
                                            if (mm9Var2.c().d.length() > 0) {
                                                i6 = i | 17;
                                            }
                                        } else if (t50Var instanceof plg) {
                                            tlgVar = ((plg) t50Var).a;
                                            str = tlgVar.f;
                                            if (str != null) {
                                                str2 = tlgVar.e;
                                                if (str2 != null) {
                                                    i5 = -2147483641;
                                                } else {
                                                    i5 = -2147483641;
                                                }
                                            } else {
                                                str2 = tlgVar.e;
                                                if (str2 != null) {
                                                    i5 = -2147483641;
                                                } else {
                                                    i5 = -2147483641;
                                                }
                                            }
                                        } else if (t50Var instanceof jh4) {
                                            i5 = -2147483638;
                                        } else if (t50Var instanceof mxf) {
                                            i5 = -2147483637;
                                        } else if (t50Var instanceof y90) {
                                            i5 = 8;
                                        } else if (t50Var instanceof aq6) {
                                            i5 = -2147483639;
                                        } else if (t50Var instanceof oxi) {
                                            i5 = -2147483642;
                                        } else if (t50Var instanceof e7d) {
                                            i5 = -2147483633;
                                        } else {
                                            i6 = (-2147483634) | i;
                                        }
                                    } else if (t50Var instanceof eag) {
                                        i6 = i2 | i;
                                        if (mm9Var2.c().d.length() > 0) {
                                            i6 = i | 5;
                                        }
                                    } else if (t50Var instanceof yv3) {
                                        i6 = 16 | i;
                                        if (mm9Var2.c().d.length() > 0) {
                                            i6 = i | 17;
                                        }
                                    } else if (t50Var instanceof plg) {
                                        tlgVar = ((plg) t50Var).a;
                                        str = tlgVar.f;
                                        if (str != null) {
                                            str2 = tlgVar.e;
                                            if (str2 != null) {
                                                i5 = -2147483641;
                                            } else {
                                                i5 = -2147483641;
                                            }
                                        } else {
                                            str2 = tlgVar.e;
                                            if (str2 != null) {
                                                i5 = -2147483641;
                                            } else {
                                                i5 = -2147483641;
                                            }
                                        }
                                    } else if (t50Var instanceof jh4) {
                                        i5 = -2147483638;
                                    } else if (t50Var instanceof mxf) {
                                        i5 = -2147483637;
                                    } else if (t50Var instanceof y90) {
                                        i5 = 8;
                                    } else if (t50Var instanceof aq6) {
                                        i5 = -2147483639;
                                    } else if (t50Var instanceof oxi) {
                                        i5 = -2147483642;
                                    } else if (t50Var instanceof e7d) {
                                        i5 = -2147483633;
                                    } else {
                                        i6 = (-2147483634) | i;
                                    }
                                }
                            } else if (t50Var instanceof yb1) {
                                i5 = -2147483647;
                            } else if (t50Var instanceof zj7) {
                                i5 = -2147483636;
                            } else {
                                if (mm9Var2.c().d.length() > 0) {
                                    u40Var = mm9Var2.c().j;
                                    if (u40Var.b == null) {
                                        j3 = u40Var.a;
                                        int i1112 = v40.b;
                                        if ((j3 & 1) != j) {
                                            i7 = i4;
                                        } else {
                                            i7 = 0;
                                        }
                                    } else {
                                        i7 = i4;
                                    }
                                    if (i7 != 0) {
                                    }
                                    i6 = i4 | i;
                                }
                                j2 = mm9Var2.c().j.a;
                                int i1113 = v40.b;
                                if ((j2 & 2) == j) {
                                    if (t50Var instanceof eag) {
                                        i6 = i2 | i;
                                        if (mm9Var2.c().d.length() > 0) {
                                            i6 = i | 5;
                                        }
                                    } else if (t50Var instanceof yv3) {
                                        i6 = 16 | i;
                                        if (mm9Var2.c().d.length() > 0) {
                                            i6 = i | 17;
                                        }
                                    } else if (t50Var instanceof plg) {
                                        tlgVar = ((plg) t50Var).a;
                                        str = tlgVar.f;
                                        if (str != null) {
                                            str2 = tlgVar.e;
                                            if (str2 != null) {
                                                i5 = -2147483641;
                                            } else {
                                                i5 = -2147483641;
                                            }
                                        } else {
                                            str2 = tlgVar.e;
                                            if (str2 != null) {
                                                i5 = -2147483641;
                                            } else {
                                                i5 = -2147483641;
                                            }
                                        }
                                    } else if (t50Var instanceof jh4) {
                                        i5 = -2147483638;
                                    } else if (t50Var instanceof mxf) {
                                        i5 = -2147483637;
                                    } else if (t50Var instanceof y90) {
                                        i5 = 8;
                                    } else if (t50Var instanceof aq6) {
                                        i5 = -2147483639;
                                    } else if (t50Var instanceof oxi) {
                                        i5 = -2147483642;
                                    } else if (t50Var instanceof e7d) {
                                        i5 = -2147483633;
                                    } else {
                                        i6 = (-2147483634) | i;
                                    }
                                } else if (t50Var instanceof eag) {
                                    i6 = i2 | i;
                                    if (mm9Var2.c().d.length() > 0) {
                                        i6 = i | 5;
                                    }
                                } else if (t50Var instanceof yv3) {
                                    i6 = 16 | i;
                                    if (mm9Var2.c().d.length() > 0) {
                                        i6 = i | 17;
                                    }
                                } else if (t50Var instanceof plg) {
                                    tlgVar = ((plg) t50Var).a;
                                    str = tlgVar.f;
                                    if (str != null) {
                                        str2 = tlgVar.e;
                                        if (str2 != null) {
                                            i5 = -2147483641;
                                        } else {
                                            i5 = -2147483641;
                                        }
                                    } else {
                                        str2 = tlgVar.e;
                                        if (str2 != null) {
                                            i5 = -2147483641;
                                        } else {
                                            i5 = -2147483641;
                                        }
                                    }
                                } else if (t50Var instanceof jh4) {
                                    i5 = -2147483638;
                                } else if (t50Var instanceof mxf) {
                                    i5 = -2147483637;
                                } else if (t50Var instanceof y90) {
                                    i5 = 8;
                                } else if (t50Var instanceof aq6) {
                                    i5 = -2147483639;
                                } else if (t50Var instanceof oxi) {
                                    i5 = -2147483642;
                                } else if (t50Var instanceof e7d) {
                                    i5 = -2147483633;
                                } else {
                                    i6 = (-2147483634) | i;
                                }
                            }
                        }
                        i6 = i5 | i;
                    }
                    messageModelC.F = i6;
                    c0cVar2.d = mm9Var2;
                    c0cVar2.e = vg4Var;
                    c0cVar2.f = messageModelC;
                    c0cVar2.g = messageModelC;
                    c0cVar2.h = messageModelC;
                    c0cVar2.i = i;
                    c0cVar2.j = 0;
                    c0cVar2.m = 3;
                    objA = qia.d;
                    if (mm9Var2.a.h0()) {
                        objA = null;
                    } else {
                        objA = null;
                    }
                    if (objA != obj) {
                        messageModel = messageModelC;
                        messageModel2 = messageModel;
                        messageModel3 = messageModel2;
                        i9 = 0;
                        messageModel.D = (qia) objA;
                        int iC5 = sfl.c(0, z21.b(i));
                        if (messageModel2.D != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        iB = sfl.b(iC5, z);
                        if ((iB & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        boolean zD4 = mm9Var2.a.d0();
                        boolean z7 = mm9Var2.c().y;
                        long j14 = mm9Var2.c().x;
                        if (z2) {
                            lValueOf = null;
                        } else {
                            lValueOf = null;
                        }
                        messageModel2.E = lValueOf;
                        i10 = messageModel2.G;
                        int i1114 = messageModel2.F;
                        MessageModel messageModelC8 = mm9Var2.c();
                        c cVar5 = mm9Var2.c;
                        long j15 = messageModelC8.x;
                        rt2 rt2Var9 = mm9Var2.a;
                        mm9 mm9Var9 = mm9Var2;
                        String strK5 = rt2Var9.k(j15);
                        if (i10 != 1) {
                            i11 = 0;
                            layoutB = null;
                        } else {
                            i11 = 0;
                            layoutB = null;
                        }
                        if (layoutB != null) {
                            iB2 = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, layoutB.getWidth());
                        } else {
                            iB2 = i11;
                        }
                        messageModel2.C = layoutB;
                        int i1115 = messageModel2.F;
                        c0cVar2.d = null;
                        c0cVar2.e = null;
                        c0cVar2.f = messageModel3;
                        c0cVar2.g = null;
                        c0cVar2.h = messageModel2;
                        c0cVar2.i = i;
                        c0cVar2.j = i9;
                        c0cVar2.m = i2;
                        objA = b(mm9Var9, i, i1115, iB2, iB, c0cVar2);
                        if (objA != obj) {
                            messageModel4 = messageModel2;
                            messageModel5 = messageModel3;
                            messageModel4.B = (Layout) objA;
                            return messageModel5;
                        }
                    }
                }
                if (mm9Var2.c().n != null) {
                    i6 |= 16777216;
                }
                messageModelC.F = i6;
                c0cVar2.d = mm9Var2;
                c0cVar2.e = vg4Var;
                c0cVar2.f = messageModelC;
                c0cVar2.g = messageModelC;
                c0cVar2.h = messageModelC;
                c0cVar2.i = i;
                c0cVar2.j = 0;
                c0cVar2.m = 3;
                objA = qia.d;
                if (mm9Var2.a.h0()) {
                    objA = null;
                } else {
                    objA = null;
                }
                if (objA != obj) {
                    messageModel = messageModelC;
                    messageModel2 = messageModel;
                    messageModel3 = messageModel2;
                    i9 = 0;
                    messageModel.D = (qia) objA;
                    int iC6 = sfl.c(0, z21.b(i));
                    if (messageModel2.D != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    iB = sfl.b(iC6, z);
                    if ((iB & 2) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean zD5 = mm9Var2.a.d0();
                    boolean z8 = mm9Var2.c().y;
                    long j16 = mm9Var2.c().x;
                    if (z2) {
                        lValueOf = null;
                    } else {
                        lValueOf = null;
                    }
                    messageModel2.E = lValueOf;
                    i10 = messageModel2.G;
                    int i1116 = messageModel2.F;
                    MessageModel messageModelC9 = mm9Var2.c();
                    c cVar6 = mm9Var2.c;
                    long j17 = messageModelC9.x;
                    rt2 rt2Var10 = mm9Var2.a;
                    mm9 mm9Var10 = mm9Var2;
                    String strK6 = rt2Var10.k(j17);
                    if (i10 != 1) {
                        i11 = 0;
                        layoutB = null;
                    } else {
                        i11 = 0;
                        layoutB = null;
                    }
                    if (layoutB != null) {
                        iB2 = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, layoutB.getWidth());
                    } else {
                        iB2 = i11;
                    }
                    messageModel2.C = layoutB;
                    int i1117 = messageModel2.F;
                    c0cVar2.d = null;
                    c0cVar2.e = null;
                    c0cVar2.f = messageModel3;
                    c0cVar2.g = null;
                    c0cVar2.h = messageModel2;
                    c0cVar2.i = i;
                    c0cVar2.j = i9;
                    c0cVar2.m = i2;
                    objA = b(mm9Var10, i, i1117, iB2, iB, c0cVar2);
                    if (objA != obj) {
                        messageModel4 = messageModel2;
                        messageModel5 = messageModel3;
                        messageModel4.B = (Layout) objA;
                        return messageModel5;
                    }
                }
            }
            i2 = 4;
            i3 = 2;
            if (mm9Var2.c().n != null) {
                i6 |= 16777216;
            }
            messageModelC.F = i6;
            c0cVar2.d = mm9Var2;
            c0cVar2.e = vg4Var;
            c0cVar2.f = messageModelC;
            c0cVar2.g = messageModelC;
            c0cVar2.h = messageModelC;
            c0cVar2.i = i;
            c0cVar2.j = 0;
            c0cVar2.m = 3;
            objA = qia.d;
            if (mm9Var2.a.h0()) {
                objA = null;
            } else {
                objA = null;
            }
            if (objA != obj) {
                messageModel = messageModelC;
                messageModel2 = messageModel;
                messageModel3 = messageModel2;
                i9 = 0;
                messageModel.D = (qia) objA;
                int iC7 = sfl.c(0, z21.b(i));
                if (messageModel2.D != null) {
                    z = true;
                } else {
                    z = false;
                }
                iB = sfl.b(iC7, z);
                if ((iB & 2) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean zD6 = mm9Var2.a.d0();
                boolean z9 = mm9Var2.c().y;
                long j18 = mm9Var2.c().x;
                if (z2) {
                    lValueOf = null;
                } else {
                    lValueOf = null;
                }
                messageModel2.E = lValueOf;
                i10 = messageModel2.G;
                int i1118 = messageModel2.F;
                MessageModel messageModelC10 = mm9Var2.c();
                c cVar7 = mm9Var2.c;
                long j19 = messageModelC10.x;
                rt2 rt2Var11 = mm9Var2.a;
                mm9 mm9Var11 = mm9Var2;
                String strK7 = rt2Var11.k(j19);
                if (i10 != 1) {
                    i11 = 0;
                    layoutB = null;
                } else {
                    i11 = 0;
                    layoutB = null;
                }
                if (layoutB != null) {
                    iB2 = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, layoutB.getWidth());
                } else {
                    iB2 = i11;
                }
                messageModel2.C = layoutB;
                int i1119 = messageModel2.F;
                c0cVar2.d = null;
                c0cVar2.e = null;
                c0cVar2.f = messageModel3;
                c0cVar2.g = null;
                c0cVar2.h = messageModel2;
                c0cVar2.i = i;
                c0cVar2.j = i9;
                c0cVar2.m = i2;
                objA = b(mm9Var11, i, i1119, iB2, iB, c0cVar2);
                if (objA != obj) {
                    messageModel4 = messageModel2;
                    messageModel5 = messageModel3;
                    messageModel4.B = (Layout) objA;
                    return messageModel5;
                }
            }
        }
        return obj;
    }

    public void l(Bundle bundle, plk plkVar) {
        if (((r6a) this.a) != null) {
            plkVar.b();
            return;
        }
        if (((LinkedList) this.c) == null) {
            this.c = new LinkedList();
        }
        ((LinkedList) this.c).add(plkVar);
        if (bundle != null) {
            Bundle bundle2 = (Bundle) this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        this.g = (g9i) this.d;
        if (((r6a) this.a) == null) {
            try {
                Context context = (Context) this.f;
                synchronized (vm9.class) {
                    vm9.b(context);
                }
                bpl bplVarO0 = h1h.d(context).o0(new dqb(context));
                if (bplVarO0 == null) {
                    return;
                }
                g9i g9iVar = (g9i) this.g;
                d4c d4cVar = (d4c) this.e;
                r6a r6aVar = new r6a();
                r6aVar.b = bplVarO0;
                yab.s(d4cVar);
                r6aVar.a = d4cVar;
                g9iVar.c(r6aVar);
                ArrayList arrayList = (ArrayList) this.h;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((r6a) this.a).C((vtb) it.next());
                }
                arrayList.clear();
            } catch (RemoteException e) {
                f4a.d(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }

    public d0c(d4c d4cVar, Context context) {
        this.d = new g9i(this);
        this.h = new ArrayList();
        this.e = d4cVar;
        this.f = context;
    }

    public d0c(List list, prk prkVar, Bitmap bitmap, x5a x5aVar) {
        this.a = list;
        this.b = prkVar;
        this.c = bitmap;
        this.h = x5aVar;
        final int i = 0;
        af7 af7Var = new af7(this) { // from class: s6a
            public final /* synthetic */ d0c b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:30:0x007a  */
            @Override // defpackage.af7
            public final Object invoke() {
                ex3 ex3Var;
                b87[] b87VarArr;
                b87 b87Var;
                String str;
                Object poeVar;
                int i2 = i;
                boolean zIsBitrateModeSupported = false;
                int i3 = 2;
                d0c d0cVar = this.b;
                switch (i2) {
                    case 0:
                        List list2 = (List) d0cVar.a;
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            zIsBitrateModeSupported = true;
                        } else {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                for (b87 b87Var2 : ((xx9) it.next()).e) {
                                    if (cqk.d(b87Var2.n, "video/avc") && (ex3Var = b87Var2.D) != null && ex3Var.b == 2) {
                                    }
                                }
                            }
                            zIsBitrateModeSupported = true;
                        }
                        return Boolean.valueOf(zIsBitrateModeSupported);
                    case 1:
                        prk prkVar2 = (prk) d0cVar.b;
                        if (prkVar2 instanceof rx9) {
                            return "video/avc";
                        }
                        if ((prkVar2 instanceof qx9) || (prkVar2 instanceof sx9)) {
                            xx9 xx9Var = (xx9) ww3.t1((List) d0cVar.a);
                            return (xx9Var == null || (b87VarArr = xx9Var.e) == null || (b87Var = (b87) a.b1(b87VarArr)) == null || (str = b87Var.n) == null) ? "video/avc" : str;
                        }
                        ore.o();
                        return null;
                    case 2:
                        pu6 pu6Var = new pu6(yhf.m0(new m2i(new kx6(new sw(1, (List) d0cVar.a), new x27(27), cif.a), new x27(28)), new x27(29)));
                        if (!pu6Var.hasNext()) {
                            return null;
                        }
                        float fFloatValue = ((Number) pu6Var.next()).floatValue();
                        while (pu6Var.hasNext()) {
                            fFloatValue = Math.min(fFloatValue, ((Number) pu6Var.next()).floatValue());
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        prk prkVar3 = (prk) d0cVar.b;
                        tx9 tx9Var = prkVar3 instanceof tx9 ? (tx9) prkVar3 : null;
                        if (tx9Var != null && tx9Var.k()) {
                            String str2 = (String) ((ny8) d0cVar.e).getValue();
                            try {
                                MediaCodecInfo mediaCodecInfoE = s2f.e(str2);
                                if (mediaCodecInfoE != null) {
                                    MediaCodecInfo.EncoderCapabilities encoderCapabilities = mediaCodecInfoE.getCapabilitiesForType(str2).getEncoderCapabilities();
                                    encoderCapabilities.getClass();
                                    zIsBitrateModeSupported = encoderCapabilities.isBitrateModeSupported(2);
                                }
                                poeVar = Boolean.valueOf(zIsBitrateModeSupported);
                            } catch (Throwable th) {
                                poeVar = new poe(th);
                            }
                            Throwable thA = roe.a(poeVar);
                            if (thA != null) {
                                String strO = c0a.o("checkCbrSupported(", str2, ") failed");
                                gm0.V("MediaEncoderCapabilities", strO, new fo2(strO, thA));
                            }
                            Boolean bool = Boolean.FALSE;
                            if (poeVar instanceof poe) {
                                poeVar = bool;
                            }
                            if (!((Boolean) poeVar).booleanValue() && !tx9Var.l()) {
                                i3 = 1;
                            }
                            break;
                        } else {
                            i3 = 1;
                        }
                        return Integer.valueOf(i3);
                }
            }
        };
        final int i2 = 2;
        this.d = rx8.P(2, af7Var);
        final int i3 = 1;
        this.e = rx8.P(2, new af7(this) { // from class: s6a
            public final /* synthetic */ d0c b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:30:0x007a  */
            @Override // defpackage.af7
            public final Object invoke() {
                ex3 ex3Var;
                b87[] b87VarArr;
                b87 b87Var;
                String str;
                Object poeVar;
                int i4 = i3;
                boolean zIsBitrateModeSupported = false;
                int i5 = 2;
                d0c d0cVar = this.b;
                switch (i4) {
                    case 0:
                        List list2 = (List) d0cVar.a;
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            zIsBitrateModeSupported = true;
                        } else {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                for (b87 b87Var2 : ((xx9) it.next()).e) {
                                    if (cqk.d(b87Var2.n, "video/avc") && (ex3Var = b87Var2.D) != null && ex3Var.b == 2) {
                                    }
                                }
                            }
                            zIsBitrateModeSupported = true;
                        }
                        return Boolean.valueOf(zIsBitrateModeSupported);
                    case 1:
                        prk prkVar2 = (prk) d0cVar.b;
                        if (prkVar2 instanceof rx9) {
                            return "video/avc";
                        }
                        if ((prkVar2 instanceof qx9) || (prkVar2 instanceof sx9)) {
                            xx9 xx9Var = (xx9) ww3.t1((List) d0cVar.a);
                            return (xx9Var == null || (b87VarArr = xx9Var.e) == null || (b87Var = (b87) a.b1(b87VarArr)) == null || (str = b87Var.n) == null) ? "video/avc" : str;
                        }
                        ore.o();
                        return null;
                    case 2:
                        pu6 pu6Var = new pu6(yhf.m0(new m2i(new kx6(new sw(1, (List) d0cVar.a), new x27(27), cif.a), new x27(28)), new x27(29)));
                        if (!pu6Var.hasNext()) {
                            return null;
                        }
                        float fFloatValue = ((Number) pu6Var.next()).floatValue();
                        while (pu6Var.hasNext()) {
                            fFloatValue = Math.min(fFloatValue, ((Number) pu6Var.next()).floatValue());
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        prk prkVar3 = (prk) d0cVar.b;
                        tx9 tx9Var = prkVar3 instanceof tx9 ? (tx9) prkVar3 : null;
                        if (tx9Var != null && tx9Var.k()) {
                            String str2 = (String) ((ny8) d0cVar.e).getValue();
                            try {
                                MediaCodecInfo mediaCodecInfoE = s2f.e(str2);
                                if (mediaCodecInfoE != null) {
                                    MediaCodecInfo.EncoderCapabilities encoderCapabilities = mediaCodecInfoE.getCapabilitiesForType(str2).getEncoderCapabilities();
                                    encoderCapabilities.getClass();
                                    zIsBitrateModeSupported = encoderCapabilities.isBitrateModeSupported(2);
                                }
                                poeVar = Boolean.valueOf(zIsBitrateModeSupported);
                            } catch (Throwable th) {
                                poeVar = new poe(th);
                            }
                            Throwable thA = roe.a(poeVar);
                            if (thA != null) {
                                String strO = c0a.o("checkCbrSupported(", str2, ") failed");
                                gm0.V("MediaEncoderCapabilities", strO, new fo2(strO, thA));
                            }
                            Boolean bool = Boolean.FALSE;
                            if (poeVar instanceof poe) {
                                poeVar = bool;
                            }
                            if (!((Boolean) poeVar).booleanValue() && !tx9Var.l()) {
                                i5 = 1;
                            }
                            break;
                        } else {
                            i5 = 1;
                        }
                        return Integer.valueOf(i5);
                }
            }
        });
        this.f = rx8.P(2, new af7(this) { // from class: s6a
            public final /* synthetic */ d0c b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:30:0x007a  */
            @Override // defpackage.af7
            public final Object invoke() {
                ex3 ex3Var;
                b87[] b87VarArr;
                b87 b87Var;
                String str;
                Object poeVar;
                int i4 = i2;
                boolean zIsBitrateModeSupported = false;
                int i5 = 2;
                d0c d0cVar = this.b;
                switch (i4) {
                    case 0:
                        List list2 = (List) d0cVar.a;
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            zIsBitrateModeSupported = true;
                        } else {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                for (b87 b87Var2 : ((xx9) it.next()).e) {
                                    if (cqk.d(b87Var2.n, "video/avc") && (ex3Var = b87Var2.D) != null && ex3Var.b == 2) {
                                    }
                                }
                            }
                            zIsBitrateModeSupported = true;
                        }
                        return Boolean.valueOf(zIsBitrateModeSupported);
                    case 1:
                        prk prkVar2 = (prk) d0cVar.b;
                        if (prkVar2 instanceof rx9) {
                            return "video/avc";
                        }
                        if ((prkVar2 instanceof qx9) || (prkVar2 instanceof sx9)) {
                            xx9 xx9Var = (xx9) ww3.t1((List) d0cVar.a);
                            return (xx9Var == null || (b87VarArr = xx9Var.e) == null || (b87Var = (b87) a.b1(b87VarArr)) == null || (str = b87Var.n) == null) ? "video/avc" : str;
                        }
                        ore.o();
                        return null;
                    case 2:
                        pu6 pu6Var = new pu6(yhf.m0(new m2i(new kx6(new sw(1, (List) d0cVar.a), new x27(27), cif.a), new x27(28)), new x27(29)));
                        if (!pu6Var.hasNext()) {
                            return null;
                        }
                        float fFloatValue = ((Number) pu6Var.next()).floatValue();
                        while (pu6Var.hasNext()) {
                            fFloatValue = Math.min(fFloatValue, ((Number) pu6Var.next()).floatValue());
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        prk prkVar3 = (prk) d0cVar.b;
                        tx9 tx9Var = prkVar3 instanceof tx9 ? (tx9) prkVar3 : null;
                        if (tx9Var != null && tx9Var.k()) {
                            String str2 = (String) ((ny8) d0cVar.e).getValue();
                            try {
                                MediaCodecInfo mediaCodecInfoE = s2f.e(str2);
                                if (mediaCodecInfoE != null) {
                                    MediaCodecInfo.EncoderCapabilities encoderCapabilities = mediaCodecInfoE.getCapabilitiesForType(str2).getEncoderCapabilities();
                                    encoderCapabilities.getClass();
                                    zIsBitrateModeSupported = encoderCapabilities.isBitrateModeSupported(2);
                                }
                                poeVar = Boolean.valueOf(zIsBitrateModeSupported);
                            } catch (Throwable th) {
                                poeVar = new poe(th);
                            }
                            Throwable thA = roe.a(poeVar);
                            if (thA != null) {
                                String strO = c0a.o("checkCbrSupported(", str2, ") failed");
                                gm0.V("MediaEncoderCapabilities", strO, new fo2(strO, thA));
                            }
                            Boolean bool = Boolean.FALSE;
                            if (poeVar instanceof poe) {
                                poeVar = bool;
                            }
                            if (!((Boolean) poeVar).booleanValue() && !tx9Var.l()) {
                                i5 = 1;
                            }
                            break;
                        } else {
                            i5 = 1;
                        }
                        return Integer.valueOf(i5);
                }
            }
        });
        final int i4 = 3;
        this.g = rx8.P(2, new af7(this) { // from class: s6a
            public final /* synthetic */ d0c b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:30:0x007a  */
            @Override // defpackage.af7
            public final Object invoke() {
                ex3 ex3Var;
                b87[] b87VarArr;
                b87 b87Var;
                String str;
                Object poeVar;
                int i5 = i4;
                boolean zIsBitrateModeSupported = false;
                int i6 = 2;
                d0c d0cVar = this.b;
                switch (i5) {
                    case 0:
                        List list2 = (List) d0cVar.a;
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            zIsBitrateModeSupported = true;
                        } else {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                for (b87 b87Var2 : ((xx9) it.next()).e) {
                                    if (cqk.d(b87Var2.n, "video/avc") && (ex3Var = b87Var2.D) != null && ex3Var.b == 2) {
                                    }
                                }
                            }
                            zIsBitrateModeSupported = true;
                        }
                        return Boolean.valueOf(zIsBitrateModeSupported);
                    case 1:
                        prk prkVar2 = (prk) d0cVar.b;
                        if (prkVar2 instanceof rx9) {
                            return "video/avc";
                        }
                        if ((prkVar2 instanceof qx9) || (prkVar2 instanceof sx9)) {
                            xx9 xx9Var = (xx9) ww3.t1((List) d0cVar.a);
                            return (xx9Var == null || (b87VarArr = xx9Var.e) == null || (b87Var = (b87) a.b1(b87VarArr)) == null || (str = b87Var.n) == null) ? "video/avc" : str;
                        }
                        ore.o();
                        return null;
                    case 2:
                        pu6 pu6Var = new pu6(yhf.m0(new m2i(new kx6(new sw(1, (List) d0cVar.a), new x27(27), cif.a), new x27(28)), new x27(29)));
                        if (!pu6Var.hasNext()) {
                            return null;
                        }
                        float fFloatValue = ((Number) pu6Var.next()).floatValue();
                        while (pu6Var.hasNext()) {
                            fFloatValue = Math.min(fFloatValue, ((Number) pu6Var.next()).floatValue());
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        prk prkVar3 = (prk) d0cVar.b;
                        tx9 tx9Var = prkVar3 instanceof tx9 ? (tx9) prkVar3 : null;
                        if (tx9Var != null && tx9Var.k()) {
                            String str2 = (String) ((ny8) d0cVar.e).getValue();
                            try {
                                MediaCodecInfo mediaCodecInfoE = s2f.e(str2);
                                if (mediaCodecInfoE != null) {
                                    MediaCodecInfo.EncoderCapabilities encoderCapabilities = mediaCodecInfoE.getCapabilitiesForType(str2).getEncoderCapabilities();
                                    encoderCapabilities.getClass();
                                    zIsBitrateModeSupported = encoderCapabilities.isBitrateModeSupported(2);
                                }
                                poeVar = Boolean.valueOf(zIsBitrateModeSupported);
                            } catch (Throwable th) {
                                poeVar = new poe(th);
                            }
                            Throwable thA = roe.a(poeVar);
                            if (thA != null) {
                                String strO = c0a.o("checkCbrSupported(", str2, ") failed");
                                gm0.V("MediaEncoderCapabilities", strO, new fo2(strO, thA));
                            }
                            Boolean bool = Boolean.FALSE;
                            if (poeVar instanceof poe) {
                                poeVar = bool;
                            }
                            if (!((Boolean) poeVar).booleanValue() && !tx9Var.l()) {
                                i6 = 1;
                            }
                            break;
                        } else {
                            i6 = 1;
                        }
                        return Integer.valueOf(i6);
                }
            }
        });
    }

    public d0c(ifh ifhVar, ifh ifhVar2, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = d0c.class.getName();
        this.b = ifhVar;
        this.c = ifhVar2;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.g = ny8Var4;
        this.h = ny8Var5;
    }

    public d0c(kzi kziVar, kc2 kc2Var, ic2 ic2Var, lc2 lc2Var, jgh jghVar, gg2 gg2Var, zqh zqhVar) {
        this.a = kziVar;
        this.b = kc2Var;
        this.c = ic2Var;
        this.d = lc2Var;
        this.e = jghVar;
        this.f = gg2Var;
        this.g = zqhVar;
        this.h = new i64();
    }
}
