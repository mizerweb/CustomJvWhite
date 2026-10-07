package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class duc extends mdh implements qf7 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public long H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ euc K;
    public final /* synthetic */ String[] X;
    public final /* synthetic */ l8b Y;
    public CancellationSignal e;
    public AtomicInteger f;
    public AtomicInteger g;
    public euc h;
    public l8b i;
    public vfe j;
    public vfe k;
    public wfe l;
    public wfe m;
    public wfe n;
    public Object o;
    public wfe p;
    public Closeable q;
    public Cursor r;
    public String s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duc(euc eucVar, String[] strArr, l8b l8bVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.K = eucVar;
        this.X = strArr;
        this.Y = l8bVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        duc ducVar = new duc(this.K, this.X, this.Y, lq4Var);
        ducVar.J = obj;
        return ducVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((duc) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x05dd A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:106:0x05e6 A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x05ee A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:112:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:114:0x05f8 A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x05fe A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0605  */
    /* JADX WARN: Code duplicated, block: B:121:0x0608 A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0610 A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0616  */
    /* JADX WARN: Code duplicated, block: B:126:0x061b A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0631 A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x063b A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0658  */
    /* JADX WARN: Code duplicated, block: B:133:0x065e A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x066d A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0672  */
    /* JADX WARN: Code duplicated, block: B:138:0x0675  */
    /* JADX WARN: Code duplicated, block: B:139:0x0678  */
    /* JADX WARN: Code duplicated, block: B:141:0x067b A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0685 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x0687 A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0693  */
    /* JADX WARN: Code duplicated, block: B:151:0x0698 A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:169:0x06d2 A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x06db  */
    /* JADX WARN: Code duplicated, block: B:173:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:272:0x02cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0353  */
    /* JADX WARN: Code duplicated, block: B:46:0x0356  */
    /* JADX WARN: Code duplicated, block: B:50:0x039a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0514  */
    /* JADX WARN: Code duplicated, block: B:82:0x0591 A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x059b A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x05a4 A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:93:0x05b8 A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x05be A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x05d5 A[Catch: all -> 0x05ab, TryCatch #10 {all -> 0x05ab, blocks: (B:80:0x0588, B:82:0x0591, B:84:0x059b, B:86:0x05a4, B:93:0x05b8, B:95:0x05be, B:96:0x05c8, B:97:0x05cd, B:99:0x05d5, B:100:0x05d7, B:102:0x05dd, B:106:0x05e6, B:107:0x05e8, B:109:0x05ee, B:121:0x0608, B:123:0x0610, B:126:0x061b, B:114:0x05f8, B:116:0x05fe, B:128:0x0631, B:130:0x063b, B:135:0x066d, B:141:0x067b, B:151:0x0698, B:155:0x06a1, B:158:0x06a8, B:169:0x06d2, B:174:0x06e3, B:160:0x06be, B:164:0x06c7, B:146:0x0687, B:133:0x065e, B:176:0x071b, B:177:0x0722), top: B:270:0x0588 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x047a -> B:294:0x0493). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r58) {
        /*
            Method dump skipped, instruction units count: 2203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
