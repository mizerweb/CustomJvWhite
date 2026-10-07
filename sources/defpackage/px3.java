package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class px3 extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public int f;
    public final /* synthetic */ int g;
    public Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px3(xx6[] xx6VarArr, int i, AtomicInteger atomicInteger, p41 p41Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = xx6VarArr;
        this.g = i;
        this.i = atomicInteger;
        this.j = p41Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                return new px3((xx6[]) this.h, this.g, (AtomicInteger) this.i, (p41) obj2, lq4Var);
            default:
                px3 px3Var = new px3(this.g, (l56) obj2, lq4Var);
                px3Var.i = obj;
                return px3Var;
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
        }
        return ((px3) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
        int i;
        Bitmap bitmap;
        switch (this.e) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) this.i;
                p41 p41Var = (p41) this.j;
                hu4 hu4Var = hu4.a;
                int i2 = this.f;
                try {
                    if (i2 == 0) {
                        ch3.d0(obj);
                        xx6[] xx6VarArr = (xx6[]) this.h;
                        int i3 = this.g;
                        xx6 xx6Var = xx6VarArr[i3];
                        ox3 ox3Var = new ox3(p41Var, i3);
                        this.f = 1;
                        if (xx6Var.collect(ox3Var, this) == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        if (i2 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        p41Var.i(null);
                    }
                    return sbi.a;
                } catch (Throwable th) {
                    if (atomicInteger.decrementAndGet() == 0) {
                        p41Var.i(null);
                    }
                    throw th;
                }
            default:
                je9 je9Var = je9.d;
                gu4 gu4Var = (gu4) this.i;
                hu4 hu4Var2 = hu4.a;
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    String name = gu4Var.getClass().getName();
                    int i5 = this.g;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, zo5.h(i5, "start extracting sprite by index: "), null);
                    }
                    int i6 = this.g;
                    Context context = ((l56) this.j).b;
                    switch (i6) {
                        case 0:
                            i = R.drawable.emoji_sprite_0;
                            break;
                        case 1:
                            i = R.drawable.emoji_sprite_1;
                            break;
                        case 2:
                            i = R.drawable.emoji_sprite_2;
                            break;
                        case 3:
                            i = R.drawable.emoji_sprite_3;
                            break;
                        case 4:
                            i = R.drawable.emoji_sprite_4;
                            break;
                        case 5:
                            i = R.drawable.emoji_sprite_5;
                            break;
                        case 6:
                            i = R.drawable.emoji_sprite_6;
                            break;
                        case 7:
                            i = R.drawable.emoji_sprite_7;
                            break;
                        case 8:
                            i = R.drawable.emoji_sprite_8;
                            break;
                        case 9:
                            i = R.drawable.emoji_sprite_9;
                            break;
                        case 10:
                            i = R.drawable.emoji_sprite_10;
                            break;
                        case 11:
                            i = R.drawable.emoji_sprite_11;
                            break;
                        case 12:
                            i = R.drawable.emoji_sprite_12;
                            break;
                        case 13:
                            i = R.drawable.emoji_sprite_13;
                            break;
                        case 14:
                            i = R.drawable.emoji_sprite_14;
                            break;
                        case 15:
                            i = R.drawable.emoji_sprite_15;
                            break;
                        case 16:
                            i = R.drawable.emoji_sprite_16;
                            break;
                        case 17:
                            i = R.drawable.emoji_sprite_17;
                            break;
                        case 18:
                            i = R.drawable.emoji_sprite_18;
                            break;
                        case 19:
                            i = R.drawable.emoji_sprite_19;
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            i = R.drawable.emoji_sprite_20;
                            break;
                        case 21:
                            i = R.drawable.emoji_sprite_21;
                            break;
                        case 22:
                            i = R.drawable.emoji_sprite_22;
                            break;
                        case 23:
                            i = R.drawable.emoji_sprite_23;
                            break;
                        case 24:
                            i = R.drawable.emoji_sprite_24;
                            break;
                        default:
                            i = R.drawable.emoji_sprite_25;
                            break;
                    }
                    Drawable drawableO = wk8.o(context, i);
                    bitmap = drawableO instanceof BitmapDrawable ? ((BitmapDrawable) drawableO).getBitmap() : null;
                    l56 l56Var = (l56) this.j;
                    Bitmap[] bitmapArr = l56Var.a.a;
                    int i7 = this.g;
                    bitmapArr[i7] = bitmap;
                    pzf pzfVar = l56Var.d;
                    Integer num = new Integer(i7);
                    this.i = gu4Var;
                    this.h = bitmap;
                    this.f = 1;
                    if (pzfVar.emit(num, this) == hu4Var2) {
                        return hu4Var2;
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bitmap = (Bitmap) this.h;
                    ch3.d0(obj);
                }
                String name2 = gu4Var.getClass().getName();
                int i8 = this.g;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, name2, "finish extracting sprite by index: " + i8 + " , sprite exist: " + (bitmap != null), null);
                }
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px3(int i, l56 l56Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = i;
        this.j = l56Var;
    }
}
