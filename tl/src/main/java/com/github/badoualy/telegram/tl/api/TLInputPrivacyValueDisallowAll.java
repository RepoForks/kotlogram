package com.github.badoualy.telegram.tl.api;

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public class TLInputPrivacyValueDisallowAll extends TLAbsInputPrivacyRule {
    public static final int CLASS_ID = 0xd66b66c9;

    public TLInputPrivacyValueDisallowAll() {
    }

    @Override
    public String toString() {
        return "inputPrivacyValueDisallowAll#d66b66c9";
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }
}