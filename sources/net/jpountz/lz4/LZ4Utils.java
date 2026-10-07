package net.jpountz.lz4;

import defpackage.ore;
import defpackage.zo5;

/* JADX INFO: loaded from: classes.dex */
enum LZ4Utils {
    ;

    private static final int MAX_INPUT_SIZE = 2113929216;

    public static class Match {
        int len;
        int ref;
        int start;

        public int end() {
            return this.start + this.len;
        }

        public void fix(int i) {
            this.start += i;
            this.ref += i;
            this.len -= i;
        }
    }

    public static void copyTo(Match match, Match match2) {
        match2.len = match.len;
        match2.start = match.start;
        match2.ref = match.ref;
    }

    public static int hash(int i) {
        return (i * (-1640531535)) >>> 20;
    }

    public static int hash64k(int i) {
        return (i * (-1640531535)) >>> 19;
    }

    public static int hashHC(int i) {
        return (i * (-1640531535)) >>> 17;
    }

    public static int maxCompressedLength(int i) {
        if (i < 0) {
            ore.p(zo5.h(i, "length must be >= 0, got "));
            return 0;
        }
        if (i < MAX_INPUT_SIZE) {
            return (i / 255) + i + 16;
        }
        ore.p("length must be < 2113929216");
        return 0;
    }
}
