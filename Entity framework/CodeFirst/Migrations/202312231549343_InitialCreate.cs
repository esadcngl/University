namespace CodeFirst.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class InitialCreate : DbMigration
    {
        public override void Up()
        {
            CreateTable(
                "dbo.Kategoris",
                c => new
                    {
                        KategoriID = c.Int(nullable: false, identity: true),
                        KategoriAd = c.String(),
                    })
                .PrimaryKey(t => t.KategoriID);
            
            CreateTable(
                "dbo.Urunlers",
                c => new
                    {
                        UrunID = c.Int(nullable: false, identity: true),
                        UrunAd = c.String(),
                        UrunMarka = c.String(),
                        UrunKategori = c.String(),
                        UrunStok = c.Int(nullable: false),
                        Aciklama = c.String(),
                    })
                .PrimaryKey(t => t.UrunID);
            
        }
        
        public override void Down()
        {
            DropTable("dbo.Urunlers");
            DropTable("dbo.Kategoris");
        }
    }
}
