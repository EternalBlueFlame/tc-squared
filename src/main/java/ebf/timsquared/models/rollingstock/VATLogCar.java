//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Created on:12.02.2017 - 22:37:23
// Last changed on: 12.02.2017 - 22:37:23
/**
 * @author Eternal Blue Flame
 */

package ebf.timsquared.models.rollingstock;

import ebf.tim.render.GroupedModelRender;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;


public class VATLogCar extends ModelBase
{
	private static final int textureX = 256;
	private static final int textureY = 64;

	public VATLogCar() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[38];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 24, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 184, 30, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 197, 11, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 197, 17, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 201, 4, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 134, 39, textureX, textureY); // Box 6
		bodyModel[17] = new ModelRendererTurbo(this, 209, 39, textureX, textureY); // Box 6
		bodyModel[18] = new ModelRendererTurbo(this, 144, 7, textureX, textureY); // Box 6
		bodyModel[19] = new ModelRendererTurbo(this, 159, 36, textureX, textureY); // Box 6
		bodyModel[20] = new ModelRendererTurbo(this, 214, 1, textureX, textureY); // Box 6
		bodyModel[21] = new ModelRendererTurbo(this, 214, 1, textureX, textureY); // Box 6
		bodyModel[22] = new ModelRendererTurbo(this, 214, 1, textureX, textureY); // Box 6
		bodyModel[23] = new ModelRendererTurbo(this, 214, 1, textureX, textureY); // Box 6
		bodyModel[24] = new ModelRendererTurbo(this, 214, 1, textureX, textureY); // Box 6
		bodyModel[25] = new ModelRendererTurbo(this, 214, 1, textureX, textureY); // Box 6
		bodyModel[26] = new ModelRendererTurbo(this, 214, 1, textureX, textureY); // Box 6
		bodyModel[27] = new ModelRendererTurbo(this, 214, 1, textureX, textureY); // Box 6
		bodyModel[28] = new ModelRendererTurbo(this, 214, 1, textureX, textureY); // Box 6
		bodyModel[29] = new ModelRendererTurbo(this, 214, 1, textureX, textureY); // Box 6
		bodyModel[30] = new ModelRendererTurbo(this, 214, 1, textureX, textureY); // Box 6
		bodyModel[31] = new ModelRendererTurbo(this, 214, 1, textureX, textureY); // Box 6
		bodyModel[32] = new ModelRendererTurbo(this, 214, 1, textureX, textureY); // Box 6
		bodyModel[33] = new ModelRendererTurbo(this, 214, 1, textureX, textureY); // Box 6
		bodyModel[34] = new ModelRendererTurbo(this, 214, 1, textureX, textureY); // Box 6
		bodyModel[35] = new ModelRendererTurbo(this, 214, 1, textureX, textureY); // Box 6
		bodyModel[36] = new ModelRendererTurbo(this, 214, 1, textureX, textureY); // Box 6
		bodyModel[37] = new ModelRendererTurbo(this, 214, 1, textureX, textureY); // Box 6

		bodyModel[0].addBox(0F, 0F, 0F, 59, 1, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-29.5F, -5F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 59, 5, 16, 0F); // Box 1
		bodyModel[1].setRotationPoint(-29.5F, -4F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 5
		bodyModel[2].setRotationPoint(-23F, -18F, 10F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 6
		bodyModel[3].setRotationPoint(22F, -18F, 10F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 7
		bodyModel[4].setRotationPoint(7F, -18F, 10F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 8
		bodyModel[5].setRotationPoint(-8F, -18F, 10F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 9
		bodyModel[6].setRotationPoint(22F, -18F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 10
		bodyModel[7].setRotationPoint(7F, -18F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 11
		bodyModel[8].setRotationPoint(-8F, -18F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 12
		bodyModel[9].setRotationPoint(-23F, -18F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 5, 22, 0F); // Box 13
		bodyModel[10].setRotationPoint(29.5F, -3F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 5, 22, 0F); // Box 14
		bodyModel[11].setRotationPoint(-30.5F, -3F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 15
		bodyModel[12].setRotationPoint(29.5F, 0F, -0.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 16
		bodyModel[13].setRotationPoint(33.5F, -0.5F, -1F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 17
		bodyModel[14].setRotationPoint(-34.5F, -0.5F, -1F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 18
		bodyModel[15].setRotationPoint(-33.5F, 0F, -0.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 6
		bodyModel[16].setRotationPoint(22F, -4F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 6
		bodyModel[17].setRotationPoint(7F, -4F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 6
		bodyModel[18].setRotationPoint(-8F, -4F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 6
		bodyModel[19].setRotationPoint(-23F, -4F, -11F);

		bodyModel[20].addBox(-4F, -4F, -4F, 10, 10, 10, 0F); // Log
		bodyModel[20].setRotationPoint(24F, -11F, 4F).setName(GroupedModelRender.groupedPart(0, 1));

		bodyModel[21].addBox(-4F, -4F, -4F, 10, 10, 10, 0F); // Log
		bodyModel[21].setRotationPoint(14F, -11F, 4F).setName(GroupedModelRender.groupedPart(0, 2));

		bodyModel[22].addBox(-4F, -4F, -4F, 10, 10, 10, 0F); // Log
		bodyModel[22].setRotationPoint(4F, -11F, 4F).setName(GroupedModelRender.groupedPart(0, 3));

		bodyModel[23].addBox(-4F, -4F, -4F, 10, 10, 10, 0F); // Log
		bodyModel[23].setRotationPoint(-6F, -11F, 4F).setName(GroupedModelRender.groupedPart(0, 4));

		bodyModel[24].addBox(-4F, -4F, -4F, 10, 10, 10, 0F); // Log
		bodyModel[24].setRotationPoint(-16F, -11F, 4F).setName(GroupedModelRender.groupedPart(0, 5));

		bodyModel[25].addBox(-4F, -4F, -4F, 10, 10, 10, 0F); // Log
		bodyModel[25].setRotationPoint(-26F, -11F, 4F).setName(GroupedModelRender.groupedPart(0, 6));

		bodyModel[26].addBox(-4F, -4F, -4F, 10, 10, 10, 0F); // Log
		bodyModel[26].setRotationPoint(-26F, -21F, -1F).setName(GroupedModelRender.groupedPart(0, 18));

		bodyModel[27].addBox(-4F, -4F, -4F, 10, 10, 10, 0F); // Log
		bodyModel[27].setRotationPoint(-16F, -21F, -1F).setName(GroupedModelRender.groupedPart(0, 17));

		bodyModel[28].addBox(-4F, -4F, -4F, 10, 10, 10, 0F); // Log
		bodyModel[28].setRotationPoint(-6F, -21F, -1F).setName(GroupedModelRender.groupedPart(0, 16));

		bodyModel[29].addBox(-4F, -4F, -4F, 10, 10, 10, 0F); // Log
		bodyModel[29].setRotationPoint(4F, -21F, -1F).setName(GroupedModelRender.groupedPart(0, 15));

		bodyModel[30].addBox(-4F, -4F, -4F, 10, 10, 10, 0F); // Log
		bodyModel[30].setRotationPoint(14F, -21F, -1F).setName(GroupedModelRender.groupedPart(0, 14));

		bodyModel[31].addBox(-4F, -4F, -4F, 10, 10, 10, 0F); // Log
		bodyModel[31].setRotationPoint(24F, -21F, -1F).setName(GroupedModelRender.groupedPart(0, 13));

		bodyModel[32].addBox(-4F, -4F, -4F, 10, 10, 10, 0F); // Log
		bodyModel[32].setRotationPoint(24F, -11F, -6F).setName(GroupedModelRender.groupedPart(0, 7));

		bodyModel[33].addBox(-4F, -4F, -4F, 10, 10, 10, 0F); // Log
		bodyModel[33].setRotationPoint(14F, -11F, -6F).setName(GroupedModelRender.groupedPart(0, 8));

		bodyModel[34].addBox(-4F, -4F, -4F, 10, 10, 10, 0F); // Log
		bodyModel[34].setRotationPoint(4F, -11F, -6F).setName(GroupedModelRender.groupedPart(0, 9));

		bodyModel[35].addBox(-4F, -4F, -4F, 10, 10, 10, 0F); // Log
		bodyModel[35].setRotationPoint(-6F, -11F, -6F).setName(GroupedModelRender.groupedPart(0, 10));

		bodyModel[36].addBox(-4F, -4F, -4F, 10, 10, 10, 0F); // Log
		bodyModel[36].setRotationPoint(-16F, -11F, -6F).setName(GroupedModelRender.groupedPart(0, 11));

		bodyModel[37].addBox(-4F, -4F, -4F, 10, 10, 10, 0F); // Log
		bodyModel[37].setRotationPoint(-26F, -11F, -6F).setName(GroupedModelRender.groupedPart(0, 12));
	}



	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	private ModelRendererTurbo vatlogcarModel[];
}
