package de.maxhenkel.plane.entity.render;

public class OBJModelInstance {

    private OBJModel model;
    private OBJModelOptions options;

    public OBJModelInstance(OBJModel model, OBJModelOptions options) {
        this.model = model;
        this.options = options;
    }

    public OBJModel getModel() {
        return model;
    }

    public OBJModelOptions getOptions() {
        return options;
    }
}