package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class ul7 {
    public final l7f a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final String j = ul7.class.getName();

    public ul7(l7f l7fVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8) {
        this.a = l7fVar;
        this.b = ny8Var;
        this.c = ny8Var7;
        this.d = ny8Var2;
        this.e = ny8Var3;
        this.f = ny8Var4;
        this.g = ny8Var5;
        this.h = ny8Var6;
        this.i = ny8Var8;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0209 A[Catch: CancellationException -> 0x0107, Exception -> 0x021b, TamErrorException -> 0x021e, TRY_LEAVE, TryCatch #6 {TamErrorException -> 0x021e, blocks: (B:152:0x02bf, B:142:0x0286, B:148:0x0294, B:106:0x0205, B:108:0x0209, B:121:0x0230, B:126:0x0244, B:128:0x024c, B:130:0x0252, B:133:0x0257, B:135:0x025d, B:156:0x02d9, B:158:0x02e4, B:159:0x02ea, B:102:0x01ea), top: B:227:0x01ea }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0221  */
    /* JADX WARN: Code duplicated, block: B:121:0x0230 A[Catch: CancellationException -> 0x0107, Exception -> 0x021b, TamErrorException -> 0x021e, TRY_ENTER, TRY_LEAVE, TryCatch #6 {TamErrorException -> 0x021e, blocks: (B:152:0x02bf, B:142:0x0286, B:148:0x0294, B:106:0x0205, B:108:0x0209, B:121:0x0230, B:126:0x0244, B:128:0x024c, B:130:0x0252, B:133:0x0257, B:135:0x025d, B:156:0x02d9, B:158:0x02e4, B:159:0x02ea, B:102:0x01ea), top: B:227:0x01ea }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0244 A[Catch: CancellationException -> 0x0107, Exception -> 0x021b, TamErrorException -> 0x021e, TRY_ENTER, TryCatch #6 {TamErrorException -> 0x021e, blocks: (B:152:0x02bf, B:142:0x0286, B:148:0x0294, B:106:0x0205, B:108:0x0209, B:121:0x0230, B:126:0x0244, B:128:0x024c, B:130:0x0252, B:133:0x0257, B:135:0x025d, B:156:0x02d9, B:158:0x02e4, B:159:0x02ea, B:102:0x01ea), top: B:227:0x01ea }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0257 A[Catch: CancellationException -> 0x0107, Exception -> 0x021b, TamErrorException -> 0x021e, TRY_LEAVE, TryCatch #6 {TamErrorException -> 0x021e, blocks: (B:152:0x02bf, B:142:0x0286, B:148:0x0294, B:106:0x0205, B:108:0x0209, B:121:0x0230, B:126:0x0244, B:128:0x024c, B:130:0x0252, B:133:0x0257, B:135:0x025d, B:156:0x02d9, B:158:0x02e4, B:159:0x02ea, B:102:0x01ea), top: B:227:0x01ea }] */
    /* JADX WARN: Code duplicated, block: B:137:0x027c  */
    /* JADX WARN: Code duplicated, block: B:138:0x027e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0282  */
    /* JADX WARN: Code duplicated, block: B:148:0x0294 A[Catch: CancellationException -> 0x0107, Exception -> 0x021b, TamErrorException -> 0x021e, TryCatch #6 {TamErrorException -> 0x021e, blocks: (B:152:0x02bf, B:142:0x0286, B:148:0x0294, B:106:0x0205, B:108:0x0209, B:121:0x0230, B:126:0x0244, B:128:0x024c, B:130:0x0252, B:133:0x0257, B:135:0x025d, B:156:0x02d9, B:158:0x02e4, B:159:0x02ea, B:102:0x01ea), top: B:227:0x01ea }] */
    /* JADX WARN: Code duplicated, block: B:150:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:151:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:154:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:156:0x02d9 A[Catch: CancellationException -> 0x0107, Exception -> 0x021b, TamErrorException -> 0x021e, TryCatch #6 {TamErrorException -> 0x021e, blocks: (B:152:0x02bf, B:142:0x0286, B:148:0x0294, B:106:0x0205, B:108:0x0209, B:121:0x0230, B:126:0x0244, B:128:0x024c, B:130:0x0252, B:133:0x0257, B:135:0x025d, B:156:0x02d9, B:158:0x02e4, B:159:0x02ea, B:102:0x01ea), top: B:227:0x01ea }] */
    /* JADX WARN: Code duplicated, block: B:158:0x02e4 A[Catch: CancellationException -> 0x0107, Exception -> 0x021b, TamErrorException -> 0x021e, TryCatch #6 {TamErrorException -> 0x021e, blocks: (B:152:0x02bf, B:142:0x0286, B:148:0x0294, B:106:0x0205, B:108:0x0209, B:121:0x0230, B:126:0x0244, B:128:0x024c, B:130:0x0252, B:133:0x0257, B:135:0x025d, B:156:0x02d9, B:158:0x02e4, B:159:0x02ea, B:102:0x01ea), top: B:227:0x01ea }] */
    /* JADX WARN: Code duplicated, block: B:159:0x02ea A[Catch: CancellationException -> 0x0107, Exception -> 0x021b, TamErrorException -> 0x021e, TRY_LEAVE, TryCatch #6 {TamErrorException -> 0x021e, blocks: (B:152:0x02bf, B:142:0x0286, B:148:0x0294, B:106:0x0205, B:108:0x0209, B:121:0x0230, B:126:0x0244, B:128:0x024c, B:130:0x0252, B:133:0x0257, B:135:0x025d, B:156:0x02d9, B:158:0x02e4, B:159:0x02ea, B:102:0x01ea), top: B:227:0x01ea }] */
    /* JADX WARN: Code duplicated, block: B:161:0x02f0 A[Catch: CancellationException -> 0x0107, Exception -> 0x021b, TamErrorException -> 0x033d, TRY_ENTER, TRY_LEAVE, TryCatch #7 {TamErrorException -> 0x033d, blocks: (B:123:0x0236, B:161:0x02f0), top: B:228:0x0236 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x0309  */
    /* JADX WARN: Code duplicated, block: B:169:0x0312 A[Catch: CancellationException -> 0x0107, Exception -> 0x021b, TamErrorException -> 0x0320, TRY_LEAVE, TryCatch #3 {TamErrorException -> 0x0320, blocks: (B:167:0x030e, B:169:0x0312, B:172:0x031a, B:175:0x0325, B:177:0x032b, B:163:0x02f7), top: B:222:0x02f7 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x031a A[Catch: CancellationException -> 0x0107, Exception -> 0x021b, TamErrorException -> 0x0320, TRY_ENTER, TryCatch #3 {TamErrorException -> 0x0320, blocks: (B:167:0x030e, B:169:0x0312, B:172:0x031a, B:175:0x0325, B:177:0x032b, B:163:0x02f7), top: B:222:0x02f7 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x0325 A[Catch: CancellationException -> 0x0107, Exception -> 0x021b, TamErrorException -> 0x0320, TryCatch #3 {TamErrorException -> 0x0320, blocks: (B:167:0x030e, B:169:0x0312, B:172:0x031a, B:175:0x0325, B:177:0x032b, B:163:0x02f7), top: B:222:0x02f7 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x032b A[Catch: CancellationException -> 0x0107, Exception -> 0x021b, TamErrorException -> 0x0320, TRY_LEAVE, TryCatch #3 {TamErrorException -> 0x0320, blocks: (B:167:0x030e, B:169:0x0312, B:172:0x031a, B:175:0x0325, B:177:0x032b, B:163:0x02f7), top: B:222:0x02f7 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0346 A[LOOP:1: B:77:0x0193->B:185:0x0346, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:189:0x0370  */
    /* JADX WARN: Code duplicated, block: B:191:0x037e A[LOOP:0: B:73:0x0170->B:191:0x037e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:192:0x038e  */
    /* JADX WARN: Code duplicated, block: B:203:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:204:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:206:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:209:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:210:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:212:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:213:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:215:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:216:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:228:0x0236 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x01c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x0360 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ff A[Catch: Exception -> 0x0102, CancellationException -> 0x0107, TamErrorException -> 0x010a, TryCatch #14 {CancellationException -> 0x0107, blocks: (B:167:0x030e, B:169:0x0312, B:172:0x031a, B:175:0x0325, B:177:0x032b, B:152:0x02bf, B:142:0x0286, B:148:0x0294, B:106:0x0205, B:108:0x0209, B:118:0x0228, B:121:0x0230, B:123:0x0236, B:124:0x023e, B:126:0x0244, B:128:0x024c, B:130:0x0252, B:133:0x0257, B:156:0x02d9, B:158:0x02e4, B:159:0x02ea, B:161:0x02f0, B:163:0x02f7, B:85:0x01b8, B:87:0x01c0, B:89:0x01c6, B:97:0x01d7, B:99:0x01dd, B:100:0x01e2, B:102:0x01ea, B:42:0x00fb, B:44:0x00ff, B:55:0x0118, B:58:0x011e, B:61:0x0125, B:63:0x012b, B:67:0x013d, B:69:0x0153, B:70:0x015c, B:73:0x0170, B:81:0x01a2, B:193:0x0396, B:194:0x039d, B:66:0x0138), top: B:234:0x00fb }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0115  */
    /* JADX WARN: Code duplicated, block: B:55:0x0118 A[Catch: Exception -> 0x0102, CancellationException -> 0x0107, TamErrorException -> 0x010a, TryCatch #14 {CancellationException -> 0x0107, blocks: (B:167:0x030e, B:169:0x0312, B:172:0x031a, B:175:0x0325, B:177:0x032b, B:152:0x02bf, B:142:0x0286, B:148:0x0294, B:106:0x0205, B:108:0x0209, B:118:0x0228, B:121:0x0230, B:123:0x0236, B:124:0x023e, B:126:0x0244, B:128:0x024c, B:130:0x0252, B:133:0x0257, B:156:0x02d9, B:158:0x02e4, B:159:0x02ea, B:161:0x02f0, B:163:0x02f7, B:85:0x01b8, B:87:0x01c0, B:89:0x01c6, B:97:0x01d7, B:99:0x01dd, B:100:0x01e2, B:102:0x01ea, B:42:0x00fb, B:44:0x00ff, B:55:0x0118, B:58:0x011e, B:61:0x0125, B:63:0x012b, B:67:0x013d, B:69:0x0153, B:70:0x015c, B:73:0x0170, B:81:0x01a2, B:193:0x0396, B:194:0x039d, B:66:0x0138), top: B:234:0x00fb }] */
    /* JADX WARN: Code duplicated, block: B:56:0x011b  */
    /* JADX WARN: Code duplicated, block: B:58:0x011e A[Catch: Exception -> 0x0102, CancellationException -> 0x0107, TamErrorException -> 0x010a, TryCatch #14 {CancellationException -> 0x0107, blocks: (B:167:0x030e, B:169:0x0312, B:172:0x031a, B:175:0x0325, B:177:0x032b, B:152:0x02bf, B:142:0x0286, B:148:0x0294, B:106:0x0205, B:108:0x0209, B:118:0x0228, B:121:0x0230, B:123:0x0236, B:124:0x023e, B:126:0x0244, B:128:0x024c, B:130:0x0252, B:133:0x0257, B:156:0x02d9, B:158:0x02e4, B:159:0x02ea, B:161:0x02f0, B:163:0x02f7, B:85:0x01b8, B:87:0x01c0, B:89:0x01c6, B:97:0x01d7, B:99:0x01dd, B:100:0x01e2, B:102:0x01ea, B:42:0x00fb, B:44:0x00ff, B:55:0x0118, B:58:0x011e, B:61:0x0125, B:63:0x012b, B:67:0x013d, B:69:0x0153, B:70:0x015c, B:73:0x0170, B:81:0x01a2, B:193:0x0396, B:194:0x039d, B:66:0x0138), top: B:234:0x00fb }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0122  */
    /* JADX WARN: Code duplicated, block: B:61:0x0125 A[Catch: Exception -> 0x0102, CancellationException -> 0x0107, TamErrorException -> 0x010a, TRY_LEAVE, TryCatch #14 {CancellationException -> 0x0107, blocks: (B:167:0x030e, B:169:0x0312, B:172:0x031a, B:175:0x0325, B:177:0x032b, B:152:0x02bf, B:142:0x0286, B:148:0x0294, B:106:0x0205, B:108:0x0209, B:118:0x0228, B:121:0x0230, B:123:0x0236, B:124:0x023e, B:126:0x0244, B:128:0x024c, B:130:0x0252, B:133:0x0257, B:156:0x02d9, B:158:0x02e4, B:159:0x02ea, B:161:0x02f0, B:163:0x02f7, B:85:0x01b8, B:87:0x01c0, B:89:0x01c6, B:97:0x01d7, B:99:0x01dd, B:100:0x01e2, B:102:0x01ea, B:42:0x00fb, B:44:0x00ff, B:55:0x0118, B:58:0x011e, B:61:0x0125, B:63:0x012b, B:67:0x013d, B:69:0x0153, B:70:0x015c, B:73:0x0170, B:81:0x01a2, B:193:0x0396, B:194:0x039d, B:66:0x0138), top: B:234:0x00fb }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0153 A[Catch: Exception -> 0x0102, CancellationException -> 0x0107, TamErrorException -> 0x010a, TryCatch #14 {CancellationException -> 0x0107, blocks: (B:167:0x030e, B:169:0x0312, B:172:0x031a, B:175:0x0325, B:177:0x032b, B:152:0x02bf, B:142:0x0286, B:148:0x0294, B:106:0x0205, B:108:0x0209, B:118:0x0228, B:121:0x0230, B:123:0x0236, B:124:0x023e, B:126:0x0244, B:128:0x024c, B:130:0x0252, B:133:0x0257, B:156:0x02d9, B:158:0x02e4, B:159:0x02ea, B:161:0x02f0, B:163:0x02f7, B:85:0x01b8, B:87:0x01c0, B:89:0x01c6, B:97:0x01d7, B:99:0x01dd, B:100:0x01e2, B:102:0x01ea, B:42:0x00fb, B:44:0x00ff, B:55:0x0118, B:58:0x011e, B:61:0x0125, B:63:0x012b, B:67:0x013d, B:69:0x0153, B:70:0x015c, B:73:0x0170, B:81:0x01a2, B:193:0x0396, B:194:0x039d, B:66:0x0138), top: B:234:0x00fb }] */
    /* JADX WARN: Code duplicated, block: B:70:0x015c A[Catch: Exception -> 0x0102, CancellationException -> 0x0107, TamErrorException -> 0x010a, TryCatch #14 {CancellationException -> 0x0107, blocks: (B:167:0x030e, B:169:0x0312, B:172:0x031a, B:175:0x0325, B:177:0x032b, B:152:0x02bf, B:142:0x0286, B:148:0x0294, B:106:0x0205, B:108:0x0209, B:118:0x0228, B:121:0x0230, B:123:0x0236, B:124:0x023e, B:126:0x0244, B:128:0x024c, B:130:0x0252, B:133:0x0257, B:156:0x02d9, B:158:0x02e4, B:159:0x02ea, B:161:0x02f0, B:163:0x02f7, B:85:0x01b8, B:87:0x01c0, B:89:0x01c6, B:97:0x01d7, B:99:0x01dd, B:100:0x01e2, B:102:0x01ea, B:42:0x00fb, B:44:0x00ff, B:55:0x0118, B:58:0x011e, B:61:0x0125, B:63:0x012b, B:67:0x013d, B:69:0x0153, B:70:0x015c, B:73:0x0170, B:81:0x01a2, B:193:0x0396, B:194:0x039d, B:66:0x0138), top: B:234:0x00fb }] */
    /* JADX WARN: Code duplicated, block: B:72:0x016d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0187  */
    /* JADX WARN: Code duplicated, block: B:78:0x0195  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c6 A[Catch: Exception -> 0x0102, CancellationException -> 0x0107, TamErrorException -> 0x01d2, TryCatch #11 {TamErrorException -> 0x01d2, blocks: (B:87:0x01c0, B:89:0x01c6, B:97:0x01d7, B:99:0x01dd), top: B:233:0x01c0 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code duplicated, block: B:91:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x01d7 A[Catch: Exception -> 0x0102, CancellationException -> 0x0107, TamErrorException -> 0x01d2, TryCatch #11 {TamErrorException -> 0x01d2, blocks: (B:87:0x01c0, B:89:0x01c6, B:97:0x01d7, B:99:0x01dd), top: B:233:0x01c0 }] */
    public final Object a(String str, nq4 nq4Var) throws Throwable {
        tl7 tl7Var;
        ol7 ol7Var;
        ol7 ol7Var2;
        ol7 ol7Var3;
        String str2;
        yhh yhhVar;
        String str3;
        int i;
        hu4 hu4Var;
        n29 n29Var;
        st2 st2Var;
        gda gdaVar;
        gda gdaVar2;
        m8b m8bVarC0;
        xn3 xn3Var;
        long[] jArr;
        long[] jArr2;
        int length;
        tl7 tl7Var2;
        int i2;
        long j;
        tl7 tl7Var3;
        int i3;
        int i4;
        int i5;
        gda gdaVar3;
        rt2 rt2Var;
        rt2 rt2Var2;
        String str4;
        boolean zW;
        long j2;
        tl7 tl7Var4;
        Object objM;
        rt2 rt2Var3;
        q24 q24Var;
        String str5;
        sua suaVar;
        gda gdaVar4;
        q24 q24Var2;
        sfa sfaVar;
        Object objN;
        rt2 rt2Var4;
        gda gdaVar5;
        q24 q24Var3;
        sfa sfaVar2;
        ol7 ol7Var4 = ol7.c;
        ol7 ol7Var5 = ol7.b;
        ol7 ol7Var6 = ol7.a;
        if (nq4Var instanceof tl7) {
            tl7Var = (tl7) nq4Var;
            int i6 = tl7Var.k;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                tl7Var.k = i6 - Integer.MIN_VALUE;
            } else {
                tl7Var = new tl7(this, nq4Var);
            }
        } else {
            tl7Var = new tl7(this, nq4Var);
        }
        tl7 tl7Var5 = tl7Var;
        Object objE = tl7Var5.i;
        int i7 = tl7Var5.k;
        ny8 ny8Var = this.f;
        String str6 = this.j;
        hu4 hu4Var2 = hu4.a;
        try {
            try {
                try {
                    switch (i7) {
                        case 0:
                            ch3.d0(objE);
                            pvb pvbVar = (pvb) this.b.getValue();
                            wy2 wy2Var = new wy2(str);
                            nv4 nv4Var = new nv4(16, this);
                            tl7Var5.k = 1;
                            i = 3;
                            hu4Var = hu4Var2;
                            try {
                                objE = qe7.E(pvbVar, wy2Var, str6, 0L, 0, null, nv4Var, tl7Var5, 60);
                                if (objE != hu4Var) {
                                    try {
                                        try {
                                            n29Var = (n29) objE;
                                            if (n29Var != null) {
                                                st2Var = n29Var.c;
                                            } else {
                                                st2Var = null;
                                            }
                                            if (n29Var != null) {
                                                gdaVar = n29Var.j;
                                            } else {
                                                gdaVar = null;
                                            }
                                            if (n29Var != null) {
                                                gdaVar2 = n29Var.e;
                                            } else {
                                                gdaVar2 = null;
                                            }
                                            if (st2Var == null) {
                                                gm0.n(str6, "Failed to load channel/chat post/message by link, chat is null");
                                                return ol7Var6;
                                            }
                                            try {
                                                ((a0b) this.h.getValue()).j(st2Var);
                                            } catch (TamErrorException e) {
                                                gm0.V(str6, "Failed to load channel/chat post/message by link, request missed contacts exception", e);
                                            }
                                            m8bVarC0 = ((qw2) this.e.getValue()).c0(yab.k0(st2Var));
                                            if (m8bVarC0.i()) {
                                                gm0.n(str6, "chatIds is empty");
                                                return ol7Var6;
                                            }
                                            xn3Var = (xn3) this.d.getValue();
                                            jArr = m8bVarC0.b;
                                            jArr2 = m8bVarC0.a;
                                            length = jArr2.length - 2;
                                            if (length >= 0) {
                                                tl7Var2 = tl7Var5;
                                                i2 = 0;
                                                while (true) {
                                                    j = jArr2[i2];
                                                    ol7Var2 = ol7Var4;
                                                    ol7Var3 = ol7Var5;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        i4 = 8 - ((~(i2 - length)) >>> 31);
                                                        i5 = 0;
                                                        while (true) {
                                                            if (i5 < i4) {
                                                                tl7 tl7Var6 = tl7Var2;
                                                                ol7Var = ol7Var6;
                                                                tl7Var3 = tl7Var6;
                                                                i3 = i;
                                                                str2 = null;
                                                                if (i4 == 8) {
                                                                }
                                                            } else if ((j & 255) < 128) {
                                                                try {
                                                                    long j3 = jArr[(i2 << 3) + i5];
                                                                    tl7Var5 = tl7Var2;
                                                                    tl7Var5.d = st2Var;
                                                                    tl7Var5.e = gdaVar;
                                                                    tl7Var5.f = gdaVar2;
                                                                    tl7Var5.k = 2;
                                                                    objE = xn3Var.v(j3, tl7Var5);
                                                                    if (objE == hu4Var) {
                                                                        gdaVar3 = gdaVar;
                                                                        rt2Var = (rt2) objE;
                                                                        if (!rt2Var.q0()) {
                                                                            if (gdaVar2 != null) {
                                                                            }
                                                                            ol7Var = ol7Var6;
                                                                            zW = rt2Var.W();
                                                                            j2 = rt2Var.a;
                                                                            if (!zW) {
                                                                                gm0.n(str6, "chat is not active");
                                                                                return ol7Var;
                                                                            }
                                                                            if (!((nni) this.c.getValue()).m()) {
                                                                            }
                                                                            if (gdaVar3 != null) {
                                                                                str5 = str6;
                                                                                q24Var = new q24(st2Var.a, gdaVar3.a);
                                                                                suaVar = (sua) ny8Var.getValue();
                                                                                tl7Var5.d = null;
                                                                                tl7Var5.e = null;
                                                                                tl7Var5.f = gdaVar2;
                                                                                tl7Var5.g = rt2Var;
                                                                                tl7Var5.h = q24Var;
                                                                                tl7Var5.k = 4;
                                                                                if (suaVar.m(j2, gdaVar3, tl7Var5) == hu4Var) {
                                                                                    gdaVar4 = gdaVar2;
                                                                                    q24Var2 = q24Var;
                                                                                    if (gdaVar4 == null) {
                                                                                        gm0.n(str5, "Comment is not found for comment link");
                                                                                        return ol7Var;
                                                                                    }
                                                                                    l34 l34Var = (l34) this.g.getValue();
                                                                                    long jA = this.a.a();
                                                                                    tl7Var5.d = null;
                                                                                    tl7Var5.e = null;
                                                                                    tl7Var5.f = gdaVar4;
                                                                                    tl7Var5.g = rt2Var;
                                                                                    tl7Var5.h = q24Var2;
                                                                                    tl7Var5.k = 5;
                                                                                    objN = l34.n(l34Var, q24Var2, gdaVar4, jA, tl7Var5);
                                                                                    if (objN == hu4Var) {
                                                                                        rt2Var4 = rt2Var;
                                                                                        objE = objN;
                                                                                        gdaVar5 = gdaVar4;
                                                                                        q24Var3 = q24Var2;
                                                                                        return new nl7(rt2Var4.a, gdaVar5.b, ((Number) objE).longValue(), q24Var3);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                tl7Var4 = tl7Var5;
                                                                                if (gdaVar2 == null) {
                                                                                    gm0.n(str6, "Post/message is not found");
                                                                                    if (rt2Var.d0()) {
                                                                                    }
                                                                                }
                                                                                sua suaVar2 = (sua) ny8Var.getValue();
                                                                                str4 = null;
                                                                                tl7Var4.d = null;
                                                                                tl7Var4.e = null;
                                                                                tl7Var4.f = null;
                                                                                tl7Var4.g = rt2Var;
                                                                                tl7Var4.k = 6;
                                                                                objM = suaVar2.m(j2, gdaVar2, tl7Var4);
                                                                                if (objM != hu4Var) {
                                                                                    rt2Var3 = rt2Var;
                                                                                    objE = objM;
                                                                                    sfaVar2 = (sfa) objE;
                                                                                    if (sfaVar2 != null) {
                                                                                        return new rl7(rt2Var3.a, sfaVar2.c, sfaVar2.a);
                                                                                    }
                                                                                    boolean zD0 = rt2Var3.d0();
                                                                                    long j4 = rt2Var3.a;
                                                                                    if (zD0) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            str4 = null;
                                                                            str2 = str4;
                                                                            yhhVar = e.a;
                                                                            if (yhhVar != null) {
                                                                                str3 = yhhVar.b;
                                                                            } else {
                                                                                str3 = str2;
                                                                            }
                                                                            if (str3 == null) {
                                                                                str3 = "";
                                                                            }
                                                                            if (p90.C(str3)) {
                                                                                return ol7.d;
                                                                            }
                                                                            if (cqk.d(str3, "channel.denied")) {
                                                                                return ol7Var3;
                                                                            }
                                                                            if (cqk.d(str3, "chat.denied")) {
                                                                            }
                                                                        }
                                                                        try {
                                                                            if (rt2Var.w0()) {
                                                                                return rt2Var.d0() ? ol7Var3 : ol7Var2;
                                                                            }
                                                                            if (gdaVar2 != null || !rt2Var.f0()) {
                                                                                ol7Var = ol7Var6;
                                                                                try {
                                                                                    zW = rt2Var.W();
                                                                                    j2 = rt2Var.a;
                                                                                    if (!zW) {
                                                                                        gm0.n(str6, "chat is not active");
                                                                                        return ol7Var;
                                                                                    }
                                                                                    try {
                                                                                        if (!((nni) this.c.getValue()).m() && rt2Var.b.I.j && !rt2Var.A0()) {
                                                                                            return ol7.e;
                                                                                        }
                                                                                        if (gdaVar3 != null) {
                                                                                            str5 = str6;
                                                                                            try {
                                                                                                q24Var = new q24(st2Var.a, gdaVar3.a);
                                                                                                suaVar = (sua) ny8Var.getValue();
                                                                                                tl7Var5.d = null;
                                                                                                tl7Var5.e = null;
                                                                                                tl7Var5.f = gdaVar2;
                                                                                                tl7Var5.g = rt2Var;
                                                                                                tl7Var5.h = q24Var;
                                                                                                tl7Var5.k = 4;
                                                                                                if (suaVar.m(j2, gdaVar3, tl7Var5) == hu4Var) {
                                                                                                    gdaVar4 = gdaVar2;
                                                                                                    q24Var2 = q24Var;
                                                                                                    if (gdaVar4 == null) {
                                                                                                        gm0.n(str5, "Comment is not found for comment link");
                                                                                                        return ol7Var;
                                                                                                    }
                                                                                                    l34 l34Var2 = (l34) this.g.getValue();
                                                                                                    long jA2 = this.a.a();
                                                                                                    tl7Var5.d = null;
                                                                                                    tl7Var5.e = null;
                                                                                                    tl7Var5.f = gdaVar4;
                                                                                                    tl7Var5.g = rt2Var;
                                                                                                    tl7Var5.h = q24Var2;
                                                                                                    tl7Var5.k = 5;
                                                                                                    objN = l34.n(l34Var2, q24Var2, gdaVar4, jA2, tl7Var5);
                                                                                                    if (objN == hu4Var) {
                                                                                                        rt2Var4 = rt2Var;
                                                                                                        objE = objN;
                                                                                                        gdaVar5 = gdaVar4;
                                                                                                        q24Var3 = q24Var2;
                                                                                                        return new nl7(rt2Var4.a, gdaVar5.b, ((Number) objE).longValue(), q24Var3);
                                                                                                    }
                                                                                                }
                                                                                            } catch (CancellationException e2) {
                                                                                                e = e2;
                                                                                                str6 = str5;
                                                                                                gm0.V(str6, "Failed to load message by link, cancellation", e);
                                                                                                throw e;
                                                                                            } catch (Exception e3) {
                                                                                                e = e3;
                                                                                                str6 = str5;
                                                                                                gm0.V(str6, "Failed to load message by link, common", e);
                                                                                                return ol7Var;
                                                                                            }
                                                                                        } else {
                                                                                            tl7Var4 = tl7Var5;
                                                                                            if (gdaVar2 == null) {
                                                                                                gm0.n(str6, "Post/message is not found");
                                                                                                return rt2Var.d0() ? new ql7(j2) : new pl7(j2);
                                                                                            }
                                                                                            sua suaVar3 = (sua) ny8Var.getValue();
                                                                                            str4 = null;
                                                                                            try {
                                                                                                tl7Var4.d = null;
                                                                                                tl7Var4.e = null;
                                                                                                tl7Var4.f = null;
                                                                                                tl7Var4.g = rt2Var;
                                                                                                tl7Var4.k = 6;
                                                                                                objM = suaVar3.m(j2, gdaVar2, tl7Var4);
                                                                                                if (objM != hu4Var) {
                                                                                                    rt2Var3 = rt2Var;
                                                                                                    objE = objM;
                                                                                                    sfaVar2 = (sfa) objE;
                                                                                                    if (sfaVar2 != null) {
                                                                                                        return new rl7(rt2Var3.a, sfaVar2.c, sfaVar2.a);
                                                                                                    }
                                                                                                    boolean zD1 = rt2Var3.d0();
                                                                                                    long j5 = rt2Var3.a;
                                                                                                    return zD1 ? new ql7(j5) : new pl7(j5);
                                                                                                }
                                                                                            } catch (TamErrorException e4) {
                                                                                                e = e4;
                                                                                            }
                                                                                        }
                                                                                    } catch (TamErrorException e5) {
                                                                                        e = e5;
                                                                                        str4 = null;
                                                                                    }
                                                                                } catch (TamErrorException e6) {
                                                                                    e = e6;
                                                                                }
                                                                                str4 = null;
                                                                                str2 = str4;
                                                                                yhhVar = e.a;
                                                                                if (yhhVar != null) {
                                                                                    str3 = yhhVar.b;
                                                                                } else {
                                                                                    str3 = str2;
                                                                                }
                                                                                if (str3 == null) {
                                                                                    str3 = "";
                                                                                }
                                                                                if (p90.C(str3)) {
                                                                                    return ol7.d;
                                                                                }
                                                                                if (cqk.d(str3, "channel.denied")) {
                                                                                    return ol7Var3;
                                                                                }
                                                                                return cqk.d(str3, "chat.denied") ? ol7Var2 : ol7Var;
                                                                            }
                                                                            gm0.n(str6, "link to group call chat");
                                                                            try {
                                                                                sua suaVar4 = (sua) ny8Var.getValue();
                                                                                ol7Var = ol7Var6;
                                                                                try {
                                                                                    long j6 = rt2Var.a;
                                                                                    tl7Var5.d = st2Var;
                                                                                    tl7Var5.e = gdaVar3;
                                                                                    tl7Var5.f = gdaVar2;
                                                                                    tl7Var5.g = rt2Var;
                                                                                    tl7Var5.k = i;
                                                                                    Object objM2 = suaVar4.m(j6, gdaVar2, tl7Var5);
                                                                                    if (objM2 != hu4Var) {
                                                                                        rt2Var2 = rt2Var;
                                                                                        objE = objM2;
                                                                                        sfaVar = (sfa) objE;
                                                                                        if (sfaVar != null) {
                                                                                            return new ml7(rt2Var2.a, sfaVar.c, sfaVar.a);
                                                                                        }
                                                                                        rt2Var = rt2Var2;
                                                                                        zW = rt2Var.W();
                                                                                        j2 = rt2Var.a;
                                                                                        if (!zW) {
                                                                                            gm0.n(str6, "chat is not active");
                                                                                            return ol7Var;
                                                                                        }
                                                                                        if (!((nni) this.c.getValue()).m()) {
                                                                                        }
                                                                                        if (gdaVar3 != null) {
                                                                                            str5 = str6;
                                                                                            q24Var = new q24(st2Var.a, gdaVar3.a);
                                                                                            suaVar = (sua) ny8Var.getValue();
                                                                                            tl7Var5.d = null;
                                                                                            tl7Var5.e = null;
                                                                                            tl7Var5.f = gdaVar2;
                                                                                            tl7Var5.g = rt2Var;
                                                                                            tl7Var5.h = q24Var;
                                                                                            tl7Var5.k = 4;
                                                                                            if (suaVar.m(j2, gdaVar3, tl7Var5) == hu4Var) {
                                                                                                gdaVar4 = gdaVar2;
                                                                                                q24Var2 = q24Var;
                                                                                                if (gdaVar4 == null) {
                                                                                                    gm0.n(str5, "Comment is not found for comment link");
                                                                                                    return ol7Var;
                                                                                                }
                                                                                                l34 l34Var3 = (l34) this.g.getValue();
                                                                                                long jA3 = this.a.a();
                                                                                                tl7Var5.d = null;
                                                                                                tl7Var5.e = null;
                                                                                                tl7Var5.f = gdaVar4;
                                                                                                tl7Var5.g = rt2Var;
                                                                                                tl7Var5.h = q24Var2;
                                                                                                tl7Var5.k = 5;
                                                                                                objN = l34.n(l34Var3, q24Var2, gdaVar4, jA3, tl7Var5);
                                                                                                if (objN == hu4Var) {
                                                                                                    rt2Var4 = rt2Var;
                                                                                                    objE = objN;
                                                                                                    gdaVar5 = gdaVar4;
                                                                                                    q24Var3 = q24Var2;
                                                                                                    return new nl7(rt2Var4.a, gdaVar5.b, ((Number) objE).longValue(), q24Var3);
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            tl7Var4 = tl7Var5;
                                                                                            if (gdaVar2 == null) {
                                                                                                gm0.n(str6, "Post/message is not found");
                                                                                                if (rt2Var.d0()) {
                                                                                                }
                                                                                            }
                                                                                            sua suaVar5 = (sua) ny8Var.getValue();
                                                                                            str4 = null;
                                                                                            tl7Var4.d = null;
                                                                                            tl7Var4.e = null;
                                                                                            tl7Var4.f = null;
                                                                                            tl7Var4.g = rt2Var;
                                                                                            tl7Var4.k = 6;
                                                                                            objM = suaVar5.m(j2, gdaVar2, tl7Var4);
                                                                                            if (objM != hu4Var) {
                                                                                                rt2Var3 = rt2Var;
                                                                                                objE = objM;
                                                                                                sfaVar2 = (sfa) objE;
                                                                                                if (sfaVar2 != null) {
                                                                                                    return new rl7(rt2Var3.a, sfaVar2.c, sfaVar2.a);
                                                                                                }
                                                                                                boolean zD2 = rt2Var3.d0();
                                                                                                long j7 = rt2Var3.a;
                                                                                                if (zD2) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        str4 = null;
                                                                                        str2 = str4;
                                                                                        yhhVar = e.a;
                                                                                        if (yhhVar != null) {
                                                                                            str3 = yhhVar.b;
                                                                                        } else {
                                                                                            str3 = str2;
                                                                                        }
                                                                                        if (str3 == null) {
                                                                                            str3 = "";
                                                                                        }
                                                                                        if (p90.C(str3)) {
                                                                                            return ol7.d;
                                                                                        }
                                                                                        if (cqk.d(str3, "channel.denied")) {
                                                                                            return ol7Var3;
                                                                                        }
                                                                                        if (cqk.d(str3, "chat.denied")) {
                                                                                        }
                                                                                    }
                                                                                } catch (TamErrorException e7) {
                                                                                    e = e7;
                                                                                    str2 = null;
                                                                                    yhhVar = e.a;
                                                                                    if (yhhVar != null) {
                                                                                        str3 = yhhVar.b;
                                                                                    } else {
                                                                                        str3 = str2;
                                                                                    }
                                                                                    if (str3 == null) {
                                                                                        str3 = "";
                                                                                    }
                                                                                    if (p90.C(str3)) {
                                                                                        return ol7.d;
                                                                                    }
                                                                                    if (cqk.d(str3, "channel.denied")) {
                                                                                        return ol7Var3;
                                                                                    }
                                                                                    if (cqk.d(str3, "chat.denied")) {
                                                                                    }
                                                                                }
                                                                            } catch (TamErrorException e8) {
                                                                                e = e8;
                                                                                ol7Var = ol7Var6;
                                                                                str2 = null;
                                                                                yhhVar = e.a;
                                                                                if (yhhVar != null) {
                                                                                    str3 = yhhVar.b;
                                                                                } else {
                                                                                    str3 = str2;
                                                                                }
                                                                                if (str3 == null) {
                                                                                    str3 = "";
                                                                                }
                                                                                if (p90.C(str3)) {
                                                                                    return ol7.d;
                                                                                }
                                                                                if (cqk.d(str3, "channel.denied")) {
                                                                                    return ol7Var3;
                                                                                }
                                                                                if (cqk.d(str3, "chat.denied")) {
                                                                                }
                                                                            }
                                                                        } catch (TamErrorException e9) {
                                                                            e = e9;
                                                                            ol7Var = ol7Var6;
                                                                            str2 = null;
                                                                            yhhVar = e.a;
                                                                            if (yhhVar != null) {
                                                                                str3 = yhhVar.b;
                                                                            } else {
                                                                                str3 = str2;
                                                                            }
                                                                            if (str3 == null) {
                                                                                str3 = "";
                                                                            }
                                                                            if (p90.C(str3)) {
                                                                                return ol7.d;
                                                                            }
                                                                            if (cqk.d(str3, "channel.denied")) {
                                                                                return ol7Var3;
                                                                            }
                                                                            if (cqk.d(str3, "chat.denied")) {
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (TamErrorException e10) {
                                                                    e = e10;
                                                                    ol7Var = ol7Var6;
                                                                }
                                                            } else {
                                                                j >>= 8;
                                                                i5++;
                                                                tl7Var2 = tl7Var2;
                                                                ol7Var6 = ol7Var6;
                                                                i = i;
                                                            }
                                                        }
                                                    } else {
                                                        tl7 tl7Var7 = tl7Var2;
                                                        ol7Var = ol7Var6;
                                                        tl7Var3 = tl7Var7;
                                                        i3 = i;
                                                        str2 = null;
                                                    }
                                                    if (i2 != length) {
                                                        i2++;
                                                        ol7 ol7Var7 = ol7Var;
                                                        tl7Var2 = tl7Var3;
                                                        ol7Var6 = ol7Var7;
                                                        i = i3;
                                                        ol7Var4 = ol7Var2;
                                                        ol7Var5 = ol7Var3;
                                                    }
                                                }
                                            } else {
                                                ol7Var2 = ol7Var4;
                                                ol7Var3 = ol7Var5;
                                                ol7Var = ol7Var6;
                                                str2 = null;
                                            }
                                            try {
                                                throw new NoSuchElementException("The LongSet is empty");
                                            } catch (TamErrorException e11) {
                                                e = e11;
                                            }
                                        } catch (Exception e12) {
                                            e = e12;
                                            ol7Var = ol7Var6;
                                            gm0.V(str6, "Failed to load message by link, common", e);
                                            return ol7Var;
                                        }
                                    } catch (CancellationException e13) {
                                        e = e13;
                                        gm0.V(str6, "Failed to load message by link, cancellation", e);
                                        throw e;
                                    }
                                    break;
                                }
                                return hu4Var;
                            } catch (TamErrorException e14) {
                                e = e14;
                                ol7Var2 = ol7Var4;
                                ol7Var3 = ol7Var5;
                                ol7Var = ol7Var6;
                                str2 = null;
                                yhhVar = e.a;
                                if (yhhVar != null) {
                                    str3 = yhhVar.b;
                                } else {
                                    str3 = str2;
                                }
                                if (str3 == null) {
                                    str3 = "";
                                }
                                if (p90.C(str3)) {
                                    return ol7.d;
                                }
                                if (cqk.d(str3, "channel.denied")) {
                                    return ol7Var3;
                                }
                                if (cqk.d(str3, "chat.denied")) {
                                }
                            }
                        case 1:
                            ch3.d0(objE);
                            i = 3;
                            hu4Var = hu4Var2;
                            n29Var = (n29) objE;
                            if (n29Var != null) {
                                st2Var = n29Var.c;
                            } else {
                                st2Var = null;
                            }
                            if (n29Var != null) {
                                gdaVar = n29Var.j;
                            } else {
                                gdaVar = null;
                            }
                            if (n29Var != null) {
                                gdaVar2 = n29Var.e;
                            } else {
                                gdaVar2 = null;
                            }
                            if (st2Var == null) {
                                gm0.n(str6, "Failed to load channel/chat post/message by link, chat is null");
                                return ol7Var6;
                            }
                            ((a0b) this.h.getValue()).j(st2Var);
                            m8bVarC0 = ((qw2) this.e.getValue()).c0(yab.k0(st2Var));
                            if (m8bVarC0.i()) {
                                gm0.n(str6, "chatIds is empty");
                                return ol7Var6;
                            }
                            xn3Var = (xn3) this.d.getValue();
                            jArr = m8bVarC0.b;
                            jArr2 = m8bVarC0.a;
                            length = jArr2.length - 2;
                            if (length >= 0) {
                                tl7Var2 = tl7Var5;
                                i2 = 0;
                                while (true) {
                                    j = jArr2[i2];
                                    ol7Var2 = ol7Var4;
                                    ol7Var3 = ol7Var5;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        i4 = 8 - ((~(i2 - length)) >>> 31);
                                        i5 = 0;
                                        while (true) {
                                            if (i5 < i4) {
                                                tl7 tl7Var8 = tl7Var2;
                                                ol7Var = ol7Var6;
                                                tl7Var3 = tl7Var8;
                                                i3 = i;
                                                str2 = null;
                                                if (i4 == 8) {
                                                }
                                            } else {
                                                if ((j & 255) < 128) {
                                                    long j8 = jArr[(i2 << 3) + i5];
                                                    tl7Var5 = tl7Var2;
                                                    tl7Var5.d = st2Var;
                                                    tl7Var5.e = gdaVar;
                                                    tl7Var5.f = gdaVar2;
                                                    tl7Var5.k = 2;
                                                    objE = xn3Var.v(j8, tl7Var5);
                                                    if (objE == hu4Var) {
                                                        gdaVar3 = gdaVar;
                                                        rt2Var = (rt2) objE;
                                                        if (!rt2Var.q0()) {
                                                            if (gdaVar2 != null) {
                                                            }
                                                            ol7Var = ol7Var6;
                                                            zW = rt2Var.W();
                                                            j2 = rt2Var.a;
                                                            if (!zW) {
                                                                gm0.n(str6, "chat is not active");
                                                                return ol7Var;
                                                            }
                                                            if (!((nni) this.c.getValue()).m()) {
                                                            }
                                                            if (gdaVar3 != null) {
                                                                str5 = str6;
                                                                q24Var = new q24(st2Var.a, gdaVar3.a);
                                                                suaVar = (sua) ny8Var.getValue();
                                                                tl7Var5.d = null;
                                                                tl7Var5.e = null;
                                                                tl7Var5.f = gdaVar2;
                                                                tl7Var5.g = rt2Var;
                                                                tl7Var5.h = q24Var;
                                                                tl7Var5.k = 4;
                                                                if (suaVar.m(j2, gdaVar3, tl7Var5) == hu4Var) {
                                                                    gdaVar4 = gdaVar2;
                                                                    q24Var2 = q24Var;
                                                                    if (gdaVar4 == null) {
                                                                        gm0.n(str5, "Comment is not found for comment link");
                                                                        return ol7Var;
                                                                    }
                                                                    l34 l34Var4 = (l34) this.g.getValue();
                                                                    long jA4 = this.a.a();
                                                                    tl7Var5.d = null;
                                                                    tl7Var5.e = null;
                                                                    tl7Var5.f = gdaVar4;
                                                                    tl7Var5.g = rt2Var;
                                                                    tl7Var5.h = q24Var2;
                                                                    tl7Var5.k = 5;
                                                                    objN = l34.n(l34Var4, q24Var2, gdaVar4, jA4, tl7Var5);
                                                                    if (objN == hu4Var) {
                                                                        rt2Var4 = rt2Var;
                                                                        objE = objN;
                                                                        gdaVar5 = gdaVar4;
                                                                        q24Var3 = q24Var2;
                                                                        return new nl7(rt2Var4.a, gdaVar5.b, ((Number) objE).longValue(), q24Var3);
                                                                    }
                                                                }
                                                            } else {
                                                                tl7Var4 = tl7Var5;
                                                                if (gdaVar2 == null) {
                                                                    gm0.n(str6, "Post/message is not found");
                                                                    if (rt2Var.d0()) {
                                                                    }
                                                                }
                                                                sua suaVar6 = (sua) ny8Var.getValue();
                                                                str4 = null;
                                                                tl7Var4.d = null;
                                                                tl7Var4.e = null;
                                                                tl7Var4.f = null;
                                                                tl7Var4.g = rt2Var;
                                                                tl7Var4.k = 6;
                                                                objM = suaVar6.m(j2, gdaVar2, tl7Var4);
                                                                if (objM != hu4Var) {
                                                                    rt2Var3 = rt2Var;
                                                                    objE = objM;
                                                                    sfaVar2 = (sfa) objE;
                                                                    if (sfaVar2 != null) {
                                                                        return new rl7(rt2Var3.a, sfaVar2.c, sfaVar2.a);
                                                                    }
                                                                    boolean zD3 = rt2Var3.d0();
                                                                    long j9 = rt2Var3.a;
                                                                    if (zD3) {
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                            str4 = null;
                                                            str2 = str4;
                                                            yhhVar = e.a;
                                                            if (yhhVar != null) {
                                                                str3 = yhhVar.b;
                                                            } else {
                                                                str3 = str2;
                                                            }
                                                            if (str3 == null) {
                                                                str3 = "";
                                                            }
                                                            if (p90.C(str3)) {
                                                                return ol7.d;
                                                            }
                                                            if (cqk.d(str3, "channel.denied")) {
                                                                return ol7Var3;
                                                            }
                                                            if (cqk.d(str3, "chat.denied")) {
                                                            }
                                                        }
                                                        if (rt2Var.w0()) {
                                                            if (rt2Var.d0()) {
                                                            }
                                                        }
                                                        if (gdaVar2 != null) {
                                                        }
                                                        ol7Var = ol7Var6;
                                                        zW = rt2Var.W();
                                                        j2 = rt2Var.a;
                                                        if (!zW) {
                                                            gm0.n(str6, "chat is not active");
                                                            return ol7Var;
                                                        }
                                                        if (!((nni) this.c.getValue()).m()) {
                                                        }
                                                        if (gdaVar3 != null) {
                                                            str5 = str6;
                                                            q24Var = new q24(st2Var.a, gdaVar3.a);
                                                            suaVar = (sua) ny8Var.getValue();
                                                            tl7Var5.d = null;
                                                            tl7Var5.e = null;
                                                            tl7Var5.f = gdaVar2;
                                                            tl7Var5.g = rt2Var;
                                                            tl7Var5.h = q24Var;
                                                            tl7Var5.k = 4;
                                                            if (suaVar.m(j2, gdaVar3, tl7Var5) == hu4Var) {
                                                                gdaVar4 = gdaVar2;
                                                                q24Var2 = q24Var;
                                                                if (gdaVar4 == null) {
                                                                    gm0.n(str5, "Comment is not found for comment link");
                                                                    return ol7Var;
                                                                }
                                                                l34 l34Var5 = (l34) this.g.getValue();
                                                                long jA5 = this.a.a();
                                                                tl7Var5.d = null;
                                                                tl7Var5.e = null;
                                                                tl7Var5.f = gdaVar4;
                                                                tl7Var5.g = rt2Var;
                                                                tl7Var5.h = q24Var2;
                                                                tl7Var5.k = 5;
                                                                objN = l34.n(l34Var5, q24Var2, gdaVar4, jA5, tl7Var5);
                                                                if (objN == hu4Var) {
                                                                    rt2Var4 = rt2Var;
                                                                    objE = objN;
                                                                    gdaVar5 = gdaVar4;
                                                                    q24Var3 = q24Var2;
                                                                    return new nl7(rt2Var4.a, gdaVar5.b, ((Number) objE).longValue(), q24Var3);
                                                                }
                                                            }
                                                        } else {
                                                            tl7Var4 = tl7Var5;
                                                            if (gdaVar2 == null) {
                                                                gm0.n(str6, "Post/message is not found");
                                                                if (rt2Var.d0()) {
                                                                }
                                                            }
                                                            sua suaVar7 = (sua) ny8Var.getValue();
                                                            str4 = null;
                                                            tl7Var4.d = null;
                                                            tl7Var4.e = null;
                                                            tl7Var4.f = null;
                                                            tl7Var4.g = rt2Var;
                                                            tl7Var4.k = 6;
                                                            objM = suaVar7.m(j2, gdaVar2, tl7Var4);
                                                            if (objM != hu4Var) {
                                                                rt2Var3 = rt2Var;
                                                                objE = objM;
                                                                sfaVar2 = (sfa) objE;
                                                                if (sfaVar2 != null) {
                                                                    return new rl7(rt2Var3.a, sfaVar2.c, sfaVar2.a);
                                                                }
                                                                boolean zD4 = rt2Var3.d0();
                                                                long j10 = rt2Var3.a;
                                                                if (zD4) {
                                                                }
                                                            }
                                                        }
                                                        break;
                                                        str4 = null;
                                                        str2 = str4;
                                                        yhhVar = e.a;
                                                        if (yhhVar != null) {
                                                            str3 = yhhVar.b;
                                                        } else {
                                                            str3 = str2;
                                                        }
                                                        if (str3 == null) {
                                                            str3 = "";
                                                        }
                                                        if (p90.C(str3)) {
                                                            return ol7.d;
                                                        }
                                                        if (cqk.d(str3, "channel.denied")) {
                                                            return ol7Var3;
                                                        }
                                                        if (cqk.d(str3, "chat.denied")) {
                                                        }
                                                    }
                                                    break;
                                                    return hu4Var;
                                                }
                                                j >>= 8;
                                                i5++;
                                                tl7Var2 = tl7Var2;
                                                ol7Var6 = ol7Var6;
                                                i = i;
                                            }
                                        }
                                    } else {
                                        tl7 tl7Var9 = tl7Var2;
                                        ol7Var = ol7Var6;
                                        tl7Var3 = tl7Var9;
                                        i3 = i;
                                        str2 = null;
                                    }
                                    if (i2 != length) {
                                        i2++;
                                        ol7 ol7Var8 = ol7Var;
                                        tl7Var2 = tl7Var3;
                                        ol7Var6 = ol7Var8;
                                        i = i3;
                                        ol7Var4 = ol7Var2;
                                        ol7Var5 = ol7Var3;
                                    }
                                }
                            } else {
                                ol7Var2 = ol7Var4;
                                ol7Var3 = ol7Var5;
                                ol7Var = ol7Var6;
                                str2 = null;
                            }
                            throw new NoSuchElementException("The LongSet is empty");
                        case 2:
                            gda gdaVar6 = tl7Var5.f;
                            gdaVar3 = tl7Var5.e;
                            st2 st2Var2 = tl7Var5.d;
                            ch3.d0(objE);
                            ol7Var2 = ol7Var4;
                            ol7Var3 = ol7Var5;
                            ny8Var = ny8Var;
                            i = 3;
                            st2Var = st2Var2;
                            gdaVar2 = gdaVar6;
                            str6 = str6;
                            hu4Var = hu4Var2;
                            rt2Var = (rt2) objE;
                            if (!rt2Var.q0()) {
                                if (gdaVar2 != null) {
                                }
                                ol7Var = ol7Var6;
                                zW = rt2Var.W();
                                j2 = rt2Var.a;
                                if (!zW) {
                                    gm0.n(str6, "chat is not active");
                                    return ol7Var;
                                }
                                if (!((nni) this.c.getValue()).m()) {
                                }
                                if (gdaVar3 != null) {
                                    str5 = str6;
                                    q24Var = new q24(st2Var.a, gdaVar3.a);
                                    suaVar = (sua) ny8Var.getValue();
                                    tl7Var5.d = null;
                                    tl7Var5.e = null;
                                    tl7Var5.f = gdaVar2;
                                    tl7Var5.g = rt2Var;
                                    tl7Var5.h = q24Var;
                                    tl7Var5.k = 4;
                                    if (suaVar.m(j2, gdaVar3, tl7Var5) == hu4Var) {
                                        gdaVar4 = gdaVar2;
                                        q24Var2 = q24Var;
                                        if (gdaVar4 == null) {
                                            gm0.n(str5, "Comment is not found for comment link");
                                            return ol7Var;
                                        }
                                        l34 l34Var6 = (l34) this.g.getValue();
                                        long jA6 = this.a.a();
                                        tl7Var5.d = null;
                                        tl7Var5.e = null;
                                        tl7Var5.f = gdaVar4;
                                        tl7Var5.g = rt2Var;
                                        tl7Var5.h = q24Var2;
                                        tl7Var5.k = 5;
                                        objN = l34.n(l34Var6, q24Var2, gdaVar4, jA6, tl7Var5);
                                        if (objN == hu4Var) {
                                            rt2Var4 = rt2Var;
                                            objE = objN;
                                            gdaVar5 = gdaVar4;
                                            q24Var3 = q24Var2;
                                            return new nl7(rt2Var4.a, gdaVar5.b, ((Number) objE).longValue(), q24Var3);
                                        }
                                    }
                                } else {
                                    tl7Var4 = tl7Var5;
                                    if (gdaVar2 == null) {
                                        gm0.n(str6, "Post/message is not found");
                                        if (rt2Var.d0()) {
                                        }
                                    }
                                    sua suaVar8 = (sua) ny8Var.getValue();
                                    str4 = null;
                                    tl7Var4.d = null;
                                    tl7Var4.e = null;
                                    tl7Var4.f = null;
                                    tl7Var4.g = rt2Var;
                                    tl7Var4.k = 6;
                                    objM = suaVar8.m(j2, gdaVar2, tl7Var4);
                                    if (objM != hu4Var) {
                                        rt2Var3 = rt2Var;
                                        objE = objM;
                                        sfaVar2 = (sfa) objE;
                                        if (sfaVar2 != null) {
                                            return new rl7(rt2Var3.a, sfaVar2.c, sfaVar2.a);
                                        }
                                        boolean zD5 = rt2Var3.d0();
                                        long j11 = rt2Var3.a;
                                        if (zD5) {
                                        }
                                    }
                                }
                                break;
                                str4 = null;
                                str2 = str4;
                                yhhVar = e.a;
                                if (yhhVar != null) {
                                    str3 = yhhVar.b;
                                } else {
                                    str3 = str2;
                                }
                                if (str3 == null) {
                                    str3 = "";
                                }
                                if (p90.C(str3)) {
                                    return ol7.d;
                                }
                                if (cqk.d(str3, "channel.denied")) {
                                    return ol7Var3;
                                }
                                if (cqk.d(str3, "chat.denied")) {
                                }
                            }
                            if (rt2Var.w0()) {
                                if (rt2Var.d0()) {
                                }
                            }
                            if (gdaVar2 != null) {
                            }
                            ol7Var = ol7Var6;
                            zW = rt2Var.W();
                            j2 = rt2Var.a;
                            if (!zW) {
                                gm0.n(str6, "chat is not active");
                                return ol7Var;
                            }
                            if (!((nni) this.c.getValue()).m()) {
                            }
                            if (gdaVar3 != null) {
                                str5 = str6;
                                q24Var = new q24(st2Var.a, gdaVar3.a);
                                suaVar = (sua) ny8Var.getValue();
                                tl7Var5.d = null;
                                tl7Var5.e = null;
                                tl7Var5.f = gdaVar2;
                                tl7Var5.g = rt2Var;
                                tl7Var5.h = q24Var;
                                tl7Var5.k = 4;
                                if (suaVar.m(j2, gdaVar3, tl7Var5) == hu4Var) {
                                    gdaVar4 = gdaVar2;
                                    q24Var2 = q24Var;
                                    if (gdaVar4 == null) {
                                        gm0.n(str5, "Comment is not found for comment link");
                                        return ol7Var;
                                    }
                                    l34 l34Var7 = (l34) this.g.getValue();
                                    long jA7 = this.a.a();
                                    tl7Var5.d = null;
                                    tl7Var5.e = null;
                                    tl7Var5.f = gdaVar4;
                                    tl7Var5.g = rt2Var;
                                    tl7Var5.h = q24Var2;
                                    tl7Var5.k = 5;
                                    objN = l34.n(l34Var7, q24Var2, gdaVar4, jA7, tl7Var5);
                                    if (objN == hu4Var) {
                                        rt2Var4 = rt2Var;
                                        objE = objN;
                                        gdaVar5 = gdaVar4;
                                        q24Var3 = q24Var2;
                                        return new nl7(rt2Var4.a, gdaVar5.b, ((Number) objE).longValue(), q24Var3);
                                    }
                                }
                            } else {
                                tl7Var4 = tl7Var5;
                                if (gdaVar2 == null) {
                                    gm0.n(str6, "Post/message is not found");
                                    if (rt2Var.d0()) {
                                    }
                                }
                                sua suaVar9 = (sua) ny8Var.getValue();
                                str4 = null;
                                tl7Var4.d = null;
                                tl7Var4.e = null;
                                tl7Var4.f = null;
                                tl7Var4.g = rt2Var;
                                tl7Var4.k = 6;
                                objM = suaVar9.m(j2, gdaVar2, tl7Var4);
                                if (objM != hu4Var) {
                                    rt2Var3 = rt2Var;
                                    objE = objM;
                                    sfaVar2 = (sfa) objE;
                                    if (sfaVar2 != null) {
                                        return new rl7(rt2Var3.a, sfaVar2.c, sfaVar2.a);
                                    }
                                    boolean zD6 = rt2Var3.d0();
                                    long j12 = rt2Var3.a;
                                    if (zD6) {
                                    }
                                }
                            }
                            break;
                            str4 = null;
                            str2 = str4;
                            yhhVar = e.a;
                            if (yhhVar != null) {
                                str3 = yhhVar.b;
                            } else {
                                str3 = str2;
                            }
                            if (str3 == null) {
                                str3 = "";
                            }
                            if (p90.C(str3)) {
                                return ol7.d;
                            }
                            if (cqk.d(str3, "channel.denied")) {
                                return ol7Var3;
                            }
                            if (cqk.d(str3, "chat.denied")) {
                            }
                            break;
                            return hu4Var;
                        case 3:
                            rt2 rt2Var5 = tl7Var5.g;
                            gdaVar2 = tl7Var5.f;
                            gdaVar3 = tl7Var5.e;
                            st2 st2Var3 = tl7Var5.d;
                            ch3.d0(objE);
                            ol7Var2 = ol7Var4;
                            ol7Var3 = ol7Var5;
                            ol7Var = ol7Var6;
                            rt2Var2 = rt2Var5;
                            ny8Var = ny8Var;
                            hu4Var = hu4Var2;
                            st2Var = st2Var3;
                            str6 = str6;
                            sfaVar = (sfa) objE;
                            if (sfaVar != null) {
                                return new ml7(rt2Var2.a, sfaVar.c, sfaVar.a);
                            }
                            rt2Var = rt2Var2;
                            zW = rt2Var.W();
                            j2 = rt2Var.a;
                            if (!zW) {
                                gm0.n(str6, "chat is not active");
                                return ol7Var;
                            }
                            if (!((nni) this.c.getValue()).m()) {
                                break;
                            }
                            if (gdaVar3 != null) {
                                str5 = str6;
                                q24Var = new q24(st2Var.a, gdaVar3.a);
                                suaVar = (sua) ny8Var.getValue();
                                tl7Var5.d = null;
                                tl7Var5.e = null;
                                tl7Var5.f = gdaVar2;
                                tl7Var5.g = rt2Var;
                                tl7Var5.h = q24Var;
                                tl7Var5.k = 4;
                                if (suaVar.m(j2, gdaVar3, tl7Var5) == hu4Var) {
                                    gdaVar4 = gdaVar2;
                                    q24Var2 = q24Var;
                                    if (gdaVar4 == null) {
                                        gm0.n(str5, "Comment is not found for comment link");
                                        return ol7Var;
                                    }
                                    l34 l34Var8 = (l34) this.g.getValue();
                                    long jA8 = this.a.a();
                                    tl7Var5.d = null;
                                    tl7Var5.e = null;
                                    tl7Var5.f = gdaVar4;
                                    tl7Var5.g = rt2Var;
                                    tl7Var5.h = q24Var2;
                                    tl7Var5.k = 5;
                                    objN = l34.n(l34Var8, q24Var2, gdaVar4, jA8, tl7Var5);
                                    if (objN == hu4Var) {
                                        rt2Var4 = rt2Var;
                                        objE = objN;
                                        gdaVar5 = gdaVar4;
                                        q24Var3 = q24Var2;
                                        return new nl7(rt2Var4.a, gdaVar5.b, ((Number) objE).longValue(), q24Var3);
                                    }
                                }
                            } else {
                                tl7Var4 = tl7Var5;
                                if (gdaVar2 == null) {
                                    gm0.n(str6, "Post/message is not found");
                                    if (rt2Var.d0()) {
                                    }
                                }
                                sua suaVar10 = (sua) ny8Var.getValue();
                                str4 = null;
                                tl7Var4.d = null;
                                tl7Var4.e = null;
                                tl7Var4.f = null;
                                tl7Var4.g = rt2Var;
                                tl7Var4.k = 6;
                                objM = suaVar10.m(j2, gdaVar2, tl7Var4);
                                if (objM != hu4Var) {
                                    rt2Var3 = rt2Var;
                                    objE = objM;
                                    sfaVar2 = (sfa) objE;
                                    if (sfaVar2 != null) {
                                        return new rl7(rt2Var3.a, sfaVar2.c, sfaVar2.a);
                                    }
                                    boolean zD7 = rt2Var3.d0();
                                    long j13 = rt2Var3.a;
                                    if (zD7) {
                                    }
                                }
                            }
                            return hu4Var;
                            str4 = null;
                            str2 = str4;
                            yhhVar = e.a;
                            if (yhhVar != null) {
                                str3 = yhhVar.b;
                            } else {
                                str3 = str2;
                            }
                            if (str3 == null) {
                                str3 = "";
                            }
                            if (p90.C(str3)) {
                                return ol7.d;
                            }
                            if (cqk.d(str3, "channel.denied")) {
                                return ol7Var3;
                            }
                            if (cqk.d(str3, "chat.denied")) {
                            }
                        case 4:
                            q24 q24Var4 = tl7Var5.h;
                            rt2 rt2Var6 = tl7Var5.g;
                            gda gdaVar7 = tl7Var5.f;
                            ch3.d0(objE);
                            ol7Var = ol7Var6;
                            rt2Var = rt2Var6;
                            str5 = str6;
                            gdaVar4 = gdaVar7;
                            q24Var2 = q24Var4;
                            hu4Var = hu4Var2;
                            if (gdaVar4 == null) {
                                gm0.n(str5, "Comment is not found for comment link");
                                return ol7Var;
                            }
                            l34 l34Var9 = (l34) this.g.getValue();
                            long jA9 = this.a.a();
                            tl7Var5.d = null;
                            tl7Var5.e = null;
                            tl7Var5.f = gdaVar4;
                            tl7Var5.g = rt2Var;
                            tl7Var5.h = q24Var2;
                            tl7Var5.k = 5;
                            objN = l34.n(l34Var9, q24Var2, gdaVar4, jA9, tl7Var5);
                            if (objN == hu4Var) {
                                return hu4Var;
                            }
                            rt2Var4 = rt2Var;
                            objE = objN;
                            gdaVar5 = gdaVar4;
                            q24Var3 = q24Var2;
                            return new nl7(rt2Var4.a, gdaVar5.b, ((Number) objE).longValue(), q24Var3);
                        case 5:
                            q24 q24Var5 = tl7Var5.h;
                            rt2Var4 = tl7Var5.g;
                            gdaVar5 = tl7Var5.f;
                            ch3.d0(objE);
                            q24Var3 = q24Var5;
                            return new nl7(rt2Var4.a, gdaVar5.b, ((Number) objE).longValue(), q24Var3);
                        case 6:
                            rt2Var3 = tl7Var5.g;
                            ch3.d0(objE);
                            sfaVar2 = (sfa) objE;
                            if (sfaVar2 != null) {
                                return new rl7(rt2Var3.a, sfaVar2.c, sfaVar2.a);
                            }
                            boolean zD8 = rt2Var3.d0();
                            long j14 = rt2Var3.a;
                            if (zD8) {
                            }
                        default:
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                } catch (CancellationException e15) {
                    e = e15;
                    str6 = str6;
                } catch (Exception e16) {
                    e = e16;
                    ol7Var = ol7Var6;
                    str6 = str6;
                }
            } catch (TamErrorException e17) {
                e = e17;
                ol7Var2 = ol7Var4;
                ol7Var3 = ol7Var5;
                ol7Var = ol7Var6;
                str2 = null;
            }
        } catch (Exception e18) {
            e = e18;
        }
    }
}
