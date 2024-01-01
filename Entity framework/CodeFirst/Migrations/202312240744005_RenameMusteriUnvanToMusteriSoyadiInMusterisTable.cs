namespace CodeFirst.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class RenameMusteriUnvanToMusteriSoyadiInMusterisTable : DbMigration
    {
        public override void Up()
        {
            AddColumn("dbo.Musteris", "MusteriSoyadı", c => c.String());
            Sql("UPDATE Musteris Set MusteriSoyadı=MusteriUnvan");
            DropColumn("dbo.Musteris", "MusteriUnvan");
        }
        
        public override void Down()
        {
            AddColumn("dbo.Musteris", "MusteriUnvan", c => c.String());
            Sql("UPDATE Musteris Set MusteriUnvan=MusteriSoyadı");
            DropColumn("dbo.Musteris", "MusteriSoyadı");
        }
    }
}
